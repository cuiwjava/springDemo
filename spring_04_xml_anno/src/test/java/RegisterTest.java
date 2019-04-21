import com.cuiwjava.register.action.UserAction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;

/**
 * @Classname RegisterTest
 * @Description TODO
 * @Date 2019/4/21/021 12:33
 * @Created by cuiwjava
 */
@ContextConfiguration("classpath:register.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class RegisterTest {

    @Autowired
    private UserAction userAction;



    @Test
    public void test() throws SQLException {
        userAction.execute();
    }
}
