import com.cuiwjava.register.action.UserAction;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;

/**
 * @Classname AppTest
 * @Description TODO
 * @Date 2019/4/12 9:17
 * @Created by cuiwei34
 */
public class AppTest {

	@Autowired
	private UserAction userAction;

	@Test
	public void test() throws SQLException {
		userAction.execute();
	}
}
