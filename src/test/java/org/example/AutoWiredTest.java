package org.example;

import org.example.autowired.FooService;
import org.example.conf.ConfigAutowired;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWiredTest {
    @Test
    public void testAutowired(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAutowired.class);
        FooService fooService = context.getBean(FooService.class);
        fooService.run();
    }
}
