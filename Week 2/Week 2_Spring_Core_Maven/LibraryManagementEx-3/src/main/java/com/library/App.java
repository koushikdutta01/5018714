package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.Services;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/config.xml");
        Services service1 = context.getBean(Services.class);

        service1.addBook("Three Mistakes Of My Life", "Chetan Bhagat");
        service1.findBook("Three Mistakes Of My Life");
    }
}
