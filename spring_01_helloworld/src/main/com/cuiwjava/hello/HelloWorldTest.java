package main.com.cuiwjava.hello;

import org.junit.jupiter.api.Test;

/**
 * @Classname HelloWorldTest
 * @Description TODO
 * @Date 2019/3/29/029 7:47
 * @Created by cuiwjava
 */
public class HelloWorldTest {
    @Test
    void testOld(){
        HelloWorld world = new HelloWorld();
        world.setUsername("will");

        world.sayHello();
    }
}
