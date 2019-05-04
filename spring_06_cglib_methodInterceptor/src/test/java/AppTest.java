import com.cuiwjava.domain.Employee;
import com.cuiwjava.log.LogAdvice;
import com.cuiwjava.service.impl.EmployeeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Classname AppTest
 * @Description TODO
 * @Date 2019/4/22/022 0:09
 * @Created by cuiwjava
 */
//@SpringJUnitConfig
@ContextConfiguration("classpath:AppTest-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest {

    @Autowired
    private LogAdvice advice;

    @Test
    public void testSave() throws Exception{
        EmployeeServiceImpl proxy = advice.getProxyObject();
        proxy.save(new Employee());
        System.out.println(proxy.getClass());
    }

    @Test
    public void testUpdate(){
        EmployeeServiceImpl proxy = advice.getProxyObject();
        proxy.update(new Employee());
        System.out.println(proxy.getClass());
    }


}
