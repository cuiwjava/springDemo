import com.cuiwjava.lifecycle.TestBeanLifecycle;
import com.cuiwjava.utils.ApplicationContextHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Classname AppTest
 * @Description TODO
 * @Date 2019/5/14 21:30
 * @Created by cuiwei34
 */
@ContextConfiguration("classpath:hello.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest {

	public AppTest(){

	}

	@Test
	public void test1(){
		TestBeanLifecycle beanLifeCycle = ApplicationContextHelper.getBean("beanLifeCycle");


	}

}
