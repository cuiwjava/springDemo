
import com.cuiwjava.domain.Employee;
import com.cuiwjava.service.IEmployeeService;
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
    private IEmployeeService  service;

    @Test
    public void testSave() throws Exception{
        System.out.println(service.getClass());
        service.save(new Employee());
    }

    @Test
    public void testUpdate(){
        System.out.println(service.getClass());
        service.update(new Employee());
    }


}
