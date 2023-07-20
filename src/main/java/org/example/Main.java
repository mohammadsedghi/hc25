package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Meta-INF/ApplicationContext.xml");
       // MassageServiceImpl massageService = applicationContext.getBean(MassageServiceImpl.class);
//MassageServiceImpl massageService=new MassageServiceImpl(applicationContext.getBean("getResource",Resource.class));
       // massageService.sendMessage().forEach(System.out::println);
        Impl2 impl2 = applicationContext.getBean(Impl2.class);
        impl2.getMessage();
    }
}