import com.cuiwjava.container.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Classname ContainerTest
 * @Description TODO
 * @Date 2019/4/3/003 1:18
 * @Created by cuiwjava
 */
@SpringJUnitConfig
public class ContainerTest {

    @Autowired
    private Person person;
//    @Autowired
//    private BeanFactory beanFactory;
//    @Autowired
//    private ApplicationContext ctx;
    @Test
    public void test1(){
        System.out.println(person);
    }
}
