import com.cuiwjava.jdbc.dao.IEmployeeDao;
import com.cuiwjava.jdbc.domain.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration("classpath:AppTest-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AppClient {

    @Autowired
    private IEmployeeDao employeeDao;

    @Test
    public void savetest(){

        Employee employee = new Employee();
        employee.setName("wac");
        employee.setAge(40);
        employeeDao.save(employee);

    }

    @Test
    public void updatetest(){

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("wang");
        employee.setAge(40);
        employeeDao.update(employee);
    }

    @Test
    public void selectByIdTest(){

        Employee e = employeeDao.selectById(1);
        System.out.println(e);
    }
    @Test
    public void selectAll(){
        List<Employee> list = employeeDao.selectAll();
    }


}

