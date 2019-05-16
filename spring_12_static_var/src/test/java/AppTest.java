import com.cuiwjava.core.DomainDistribution;
import com.cuiwjava.utils.ApplicationContextHelper;
import com.cuiwjava.xmls.TestStatic;
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
	TestStatic testStatic;
	/**
	 * https://blog.csdn.net/u012881904/article/details/77531689
	 */
	@Test
	public void  test1(){
		String []arr = {"1","2"};
		DomainDistribution.setDomainInfo(arr);

	}

// http://www.ofbizchina.com/thread-52327-1-10.html
	// 第一种方式 applicationContext
	@Test
	public void test2(){
		testStatic = ApplicationContextHelper.getBean("testStatic");
		System.out.println(testStatic.getFrom());
	}

}
