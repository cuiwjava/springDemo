import com.cuiwjava.domain.Employee;
import com.cuiwjava.service.IEmployeeService;
import com.cuiwjava.service.impl.EmployeeServiceImpl;
import com.cuiwjava.tx.TransactionManagerAdvice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.DebuggingClassWriter;
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
    private TransactionManagerAdvice advice;
    // JDK代理对象 com.sun.proxy.$Proxy$
    @Test
    public void testSave() throws Exception{
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D:/test");
        EmployeeServiceImpl proxy = advice.getProxyObject();
        System.out.println(proxy);
    }

    @Test
    public void testUpdate(){

    }


}
