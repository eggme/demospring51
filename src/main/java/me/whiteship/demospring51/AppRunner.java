package me.whiteship.demospring51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext cxt;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Environment environment = cxt.getEnvironment();
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        System.out.println(Arrays.toString(environment.getDefaultProfiles()));

        System.out.println("proto");

        System.out.println(cxt.getBean(Proto.class));
        System.out.println(cxt.getBean(Proto.class));
        System.out.println(cxt.getBean(Proto.class));

        System.out.println("single");

        System.out.println(cxt.getBean(Single.class));
        System.out.println(cxt.getBean(Single.class));
        System.out.println(cxt.getBean(Single.class));

        System.out.println("proto by single");

        System.out.println(cxt.getBean(Single.class).getProto());
        System.out.println(cxt.getBean(Single.class).getProto());
        System.out.println(cxt.getBean(Single.class).getProto());
    }
}

