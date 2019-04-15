import com.cuiwjava.register.action.UserAction;
import com.cuiwjava.register.di.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;

/**
 * @Classname AppTest
 * @Description TODO
 * @Date 2019/4/12 9:17
 * @Created by cuiwei34
 */
@ContextConfiguration("classpath:AppTest-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest {

	@Autowired
	private UserAction userAction;

	@Autowired
	private Person person;

	@Test
	public void test() throws SQLException {
		userAction.execute();
	}

	@Test
	public void test1() {
		System.out.println(person);
	}


}
