import com.cuiwjava.domain.Employee;
import com.cuiwjava.service.IEmployeeService;
import com.cuiwjava.tx.TransactionManagerAdvice;
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
    private TransactionManagerAdvice transactionManagerAdvice;

    @Test
    public void testSave(){
        IEmployeeService proxyObject = transactionManagerAdvice.getProxyObject();
        proxyObject.save(new Employee());
        System.out.println(proxyObject);
    }
    @Test
    public void testUpdate(){

    }

    @Test
    public void testlistAll(){

    }
}
