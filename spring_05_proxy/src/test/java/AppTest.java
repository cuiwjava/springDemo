import com.cuiwjava.domain.Employee;
import com.cuiwjava.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
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
    private IEmployeeService service;

    @Test
    public void testSave(){
        service.save(new Employee());
        System.out.println("保存成功");
    }

    public void testUpdate(){
        service.update(new Employee());
        throw new RuntimeException("故意错误的");
    }


}
