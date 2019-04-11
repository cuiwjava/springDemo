import com.cuiwjava.createbean._01_constructor.Cat1;
import com.cuiwjava.createbean._02_static_factory.Cat2;
import com.cuiwjava.createbean._02_static_factory.Cat2Factory;
import com.cuiwjava.createbean._03_instance_fatory.Cat3;
import com.cuiwjava.createbean._03_instance_fatory.Cat3Factory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Classname App
 * @Description TODO
 * @Date 2019/4/3/003 0:11
 * @Created by cuiwjava
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 上下文配置对象
@ContextConfiguration("classpath:AppTest-context.xml")
public class AppTest {
    @Autowired
    private Cat1 cat1;
    @Autowired
    private Cat2 cat2;
    @Autowired
    private Cat2 cat3;
    @Autowired
    private Cat2 cat4;

    @Test
    public void test(){
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
    }

    @Test
    public void testOld(){
        // 1. 构造器
        cat1 =  new Cat1();
        // 2. 静态工厂方法
        Cat2 cat2 = Cat2Factory.createInstance();
        // 3. 实例
        Cat3 cat3 = new Cat3Factory().createInstance();


    }
}
