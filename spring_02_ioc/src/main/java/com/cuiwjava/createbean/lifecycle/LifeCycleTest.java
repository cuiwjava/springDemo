package com.cuiwjava.createbean.lifecycle;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import lombok.Cleanup;
//@ContextConfiguration("classpath:lifecycle.xml")
//@RunWith(SpringJUnit4ClassRunner.class)
public class LifeCycleTest {

//    @Autowired
//    private MyDatasource myDatasource;
    @Test
    public void test(){
        //myDatasource.doaction();
        //如果MyDatasource是单例，它的scope为singleton 则会自动执行destroy-method="close"
        //结果：创建 打开 运行 销毁

        /*
        <bean id="myDatasource" class="com.wac.springtest.ioctest.lifecycle.MyDatasource"
          scope="prototype" init-method="open" destroy-method="close"/>
         */
        //如果为多例 每次用都会创建一个新的实例 默认不执行 只能手动释放
        //结果：创建 打开 运行

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("AppTest-context.xml");
        MyDatasource ds = ctx.getBean("myDataSource", MyDatasource.class);
        ds.doWork();
        ctx.close();
    }

    @Test
    public void test1(){
        @Cleanup
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("AppTest-context.xml");
        MyDatasource ds = ctx.getBean("myDataSource", MyDatasource.class);
        ds.doWork();
        ctx.close();
    }
}