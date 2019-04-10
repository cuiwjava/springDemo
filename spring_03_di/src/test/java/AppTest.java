import com.cuiwjava.xml_autowired.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Classname AppTest
 * @Description TODO
 * @Date 2019/4/9/009 7:27
 * @Created by cuiwjava
 */
@SpringJUnitConfig
public class AppTest {

    @Autowired
    private Person person;

    @Test
    public void test(){
        System.out.println(person);
    }
}
