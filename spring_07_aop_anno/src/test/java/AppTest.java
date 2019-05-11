
import com.cuiwjava.domain.Employee;
import com.cuiwjava.service.IEmployeeService;
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
//    @Autowired
//    private IEmployeeService  service; 2/
    @Autowired
    private EmployeeServiceImpl service;
    /*
        CGLIB 不需要实现类接口
     */
    @Test
    public void testSave() throws Exception{
        System.out.println(service.getClass());
        service.save(new Employee());
        /**
         * 打印结果如下: 则说明没有采用代理，问题在于Pointcut
         * class com.cuiwjava.service.impl.EmployeeServiceImpl
            保存员工

         *
         */
    }

    @Test
    public void testUpdate(){
        System.out.println(service.getClass());
        service.update(new Employee());
    }


}
