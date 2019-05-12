import com.cuiwjava.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = AppConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AppClient {

    @Autowired
    private AccountService accountService;

    @Test
    public void test1(){

        accountService.trans(10086L,10010L,100);

    }


}