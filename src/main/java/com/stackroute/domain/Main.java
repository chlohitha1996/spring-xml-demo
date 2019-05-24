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


        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Movie mv=(Movie) applicationContext.getBean("movie");
        System.out.println("Actor information using application context:\n "+mv);



        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie movie3=(Movie)((DefaultListableBeanFactory)beanDefinitionRegistry).getBean("movie1");
        System.out.println("Actor information using application context:\n" +movie3);

    }

}



