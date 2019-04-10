import com.cuiwjava.di_setter.CollectionBean;
import com.cuiwjava.di_setter.Employee;
import com.cuiwjava.di_setter.Person1;
import com.cuiwjava.xml_autowired.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Classname AppTest
 * @Description TODO
 * @Date 2019/4/9/009 7:27
 * @Created by cuiwjava
 */

@ContextConfiguration("classpath:AppTest-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest {

    @Autowired
    private Person person;

    @Autowired
    private Employee employee;

    @Autowired
    private Person1 person1;

    @Autowired
    private CollectionBean collectionBean;
    @Test
    public void test(){
        System.out.println(person);
    }

    @Test
    public void test1(){
        System.out.println(employee);
    }

    @Test
    public void test2(){
        System.out.println(person1);
    }



}
