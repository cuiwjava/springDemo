import com.cuiwjava.di_constructor.CollectionBean;
import com.cuiwjava.di_constructor.Employee;
import com.cuiwjava.di_constructor.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:di_constructor.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class di_constructorTest {
    @Autowired
    private Employee employee;
    @Autowired
    private Person person;

    @Autowired
    private CollectionBean collectionBean;
    @Test
    public void test(){
        System.out.println(employee);
        System.out.println(person);
        System.out.println(collectionBean);
    }
}