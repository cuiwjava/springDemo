package com.cuiwjava.container;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @Classname App
 * @Description TODO
 * @Date 2019/4/3/003 0:11
 * @Created by cuiwjava
 */
public class App {
    //使用BeanFactory
    /*
    结论:BeanFactory有延迟初始化lazy特点，在创建Spring容器的时候，不会立马去创建容器中管理的Bean对象
    而是要等到从容器中去获取对象的时候，才去创建对象
     */

    /**
     * ------------------------------------
     * 构建Person.....
     * com.cuiwjava.container.Person@5542c4ed
     * @throws Exception
     */
    @Test
    public void testBeanFactory() throws Exception{
        Resource resource = new ClassPathResource("ContainerTest-context.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        System.out.println("------------------------------------");
        Person p = factory.getBean("person", Person.class);
        System.out.println(p);

    }
    //使用ApplicationContext

    /**
     * 构建Person.....
     * ---------------------------------------------
     * com.cuiwjava.container.Person@193f604a
     * @throws Exception
     */
    /*
        结论: 创建Spring容器时候，就会吧容器中管理的bean立马初始化，而不会等到获取bean的时候才去初始化
     */
    @Test
    public void testApplicationContext() throws Exception{
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ContainerTest-context.xml");
        System.out.println("---------------------------------------------");
        Person p = ctx.getBean("person", Person.class);
        System.out.println(p);
    }
}
