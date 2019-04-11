import com.cuiwjava.createbean.scope.Dog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
// 上下文配置对象
@ContextConfiguration("classpath:AppTest-context.xml")
public class ScopeTest {
    @Autowired
    private Dog dog1;
    @Autowired
    private Dog dog2;
    @Autowired
    private Dog dog3;
    @Test
    public void test(){
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}
