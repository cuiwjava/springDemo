import com.cuiwjava.createbean.lifecycle.MyDatasource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// 上下文配置对象
@ContextConfiguration("classpath:AppTest-context.xml")
public class LifeCycleTest2 {

    @Test
    public void testOld(){
        MyDatasource ds = new MyDatasource();
        // 立马初始化
        ds.open();

        ds.doWork();

        //在销毁之前执行扫尾操作
        ds.close();

    }
    @Autowired
    private MyDatasource myDatasource;

    @Test
    public void testIoC(){
        myDatasource.doWork();
    }
}
