package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationcontext.xml");
       BookService bService = (BookService) context.getBean("service");
       bService.printS();
    }
}
