package com.stackroute.domain.Demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean Property");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable  Bean Property");

    }
    public void customInit(){
        System.out.println("In Custom Init");


    }
    public void CustomDestroy(){
        System.out.println("In Destroy");


    }
}
