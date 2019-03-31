package com.cuiwjava;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Classname HelloWorldTest
 * @Description TODO
 * @Date 2019/3/31/031 12:11
 * @Created by cuiwjava
 */
public class HelloWorldTest {

    @Test
    void testOld(){
        HelloWorld world = new HelloWorld();
        world.setUsername("hahah");
        world.sayHello();
    }
    @Test
    void testIoC(){
        HelloWorld world = null;
        //1. 从classpath路径去寻找配置文件，创建资源对象
        Resource resource = new ClassPathResource("applicationContext.xml");
        //2. 根据资源对象 创建spring IOC 容器对象
        BeanFactory factory = new XmlBeanFactory(resource);
        // 3. 从SpringIOC容器中获取指定名称helloWorld的对象
        // 签名一: Object getBean(String beanName); 根据bean对象在容器中的名称来获取
//        world = (HelloWorld) factory.getBean("helloWorld");
        // 签名二: <T> T getBean(Class<T> requiredType);// 按照指定的类型去寻找bean对象
//        world = factory.getBean(HelloWorld.class);
        //---------------------------------------------------
        // 签名三: <T> T getBean(String name,@Nullable Class<T> requiredTYpe);
        // 根据bean的类型 + ID名称去寻找，推荐的
        world = factory.getBean("helloWorld", HelloWorld.class);
        world.sayHello();
    }

    void testIoCMock() throws Exception {
        String className = "cn.cuiwjava.hello.HelloWorld";
        HelloWorld world = null;
        Class clzz = Class.forName(className);
        Constructor con = clzz.getConstructor();
        con.setAccessible(true);
        // 可访问性
        Object obj = con.newInstance();
        // 内省机制设置属性值
        BeanInfo beanInfo = Introspector.getBeanInfo(clzz, Object.class);
        PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor pd: pds){
            // 所有属性名称
            String propertyName = pd.getName();
            if ("username".equals(propertyName)) {
                // username setter方法
                pd.getWriteMethod().invoke(obj, "Lucy");
            } else if ("age".equals(propertyName)) {
                // 调用age的setter方法
                pd.getWriteMethod().invoke(obj, 18);
            }
        }
        world = (HelloWorld) obj;

        world.sayHello();

    }
}
