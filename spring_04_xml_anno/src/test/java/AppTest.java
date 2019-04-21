import com.cuiwjava.register.action.UserAction;
import com.cuiwjava.register.di.Person;
import com.cuiwjava.register.di.ValueBean;
import com.cuiwjava.register.ioc.MyDataSource;
import com.cuiwjava.register.lifecycle.SomeBean;
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
	private Person person;

	@Autowired
	private ValueBean valueBean;

	@Autowired
	private MyDataSource myDataSource;

	@Autowired
	private SomeBean bean1;

	@Autowired
	private SomeBean bean2;


	@Test
	public void test1() {
		System.out.println(person);
	}

	@Test
	public void test2(){
		System.out.println(person);
		System.out.println(valueBean);
	}

	@Test
	public void test3(){
		System.out.println(myDataSource);
	}

	@Test
	public void test4(){
		System.out.println(bean1);
		System.out.println(bean2);
		bean1.doWork();
	}

}
