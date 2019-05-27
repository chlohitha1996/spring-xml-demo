package com.stackroute.domain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    @Deprecated
    public static void main(String args[]) {


        Resource resource = new ClassPathResource("beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Movie movie = (Movie) factory.getBean("movie");
        System.out.println("movie actor details : " + movie);

        Movie movie1 = (Movie)factory.getBean("movie1");
        System.out.println("movie actor details : " + movie1);

        //Using Auto wire
        Movie movie10 = (Movie)factory.getBean("movie");
        System.out.println("Using AutoWire");
        System.out.println("movie actor details : " + movie10);

       //Using Auto wire Error...ByType
      //  Movie movie10 = (Movie)factory.getBean("movie");
        //System.out.println("Using AutoWire ByType");
        //System.out.println("movie actor details : " + movie10);

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Movie mv=(Movie) applicationContext.getBean("movie");
        System.out.println("Actor information using application context:\n "+mv);

      // Definition Registry
        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie movie3=(Movie)((DefaultListableBeanFactory)beanDefinitionRegistry).getBean("movie1");
        System.out.println("Actor information using application context:\n" +movie3);

        //testing the scope
        ApplicationContext application=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie2=(Movie) application.getBean("movie");
        Movie movie4=(Movie) application.getBean("movie");

        System.out.println(movie2==movie4);

        Movie movie5=(Movie) application.getBean("movie");
        Movie movie6=(Movie) application.getBean("movie1");
        System.out.println(movie5==movie6);
        //Changing the id to name in beans.xml
        Movie movie7=(Movie) application.getBean("MovieB");//Instead of s: "movie1" We used MovieB
        System.out.println(movie7);

    }

}



