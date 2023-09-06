package org.example;

import org.example.bean.Car;
import org.example.bean.Engine;
import org.example.conf.ConfigBean;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarBeanTest {
    @Test
    public void testCreateBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigBean.class);
        Assert.assertNotNull(context);
    }
    @Test
    public void testGetBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigBean.class);

        Engine engine1 = context.getBean(Engine.class);
        Engine engine2 = context.getBean(Engine.class);

        Assert.assertSame(engine1, engine2);
    }
    @Test
    public void testGetCar() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigBean.class);

        Car car = context.getBean(Car.class);
        car.start();
        Assert.assertNotNull(car);
    }
}
