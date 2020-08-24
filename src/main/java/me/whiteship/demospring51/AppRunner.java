package me.whiteship.demospring51;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext cxt;

    @Autowired
    MessageSource messageSource;

    @Autowired
    BookRepository bookRepository;

    @Value("${app.name}")
    String appName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment environment = cxt.getEnvironment();
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        System.out.println(Arrays.toString(environment.getDefaultProfiles()));
        System.out.println(environment.getProperty("app.name"));
        System.out.println(environment.getProperty("app.about"));
        System.out.println(appName);
        while(true) {
            System.out.println(messageSource.getMessage("greeting", new String[]{"Seungjun"}, Locale.KOREA));
            System.out.println(messageSource.getMessage("greeting", new String[]{"Seungjun"}, Locale.US));
            Thread.sleep(1000l);
        }
    }
}


