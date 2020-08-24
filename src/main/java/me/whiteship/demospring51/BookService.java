package me.whiteship.demospring51;

import me.whiteship.out.MyService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BookService implements InitializingBean {

    @Autowired
    BookRepository seungJunBookRepository;
    @Autowired
    MyService myService;

    public void printBookRepository(){
        System.out.println(seungJunBookRepository.toString());
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @PostConstruct
    public void setUp(){
        // BeanFactory에 BeanPostProcessor객체를 찾아서 적용을 시킴
        // 이단계는 라이프사이클 12번 InitializingBean's afterPerpertiesSet 단계
        System.out.println(myService.toString());
    }
}
