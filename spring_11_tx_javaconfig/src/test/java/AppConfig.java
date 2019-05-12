import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Classname AppConfig
 * @Description TODO
 * @Date 2019/5/12/012 1:22
 * @Created by cuiwjava
 */
//当前项目的配置类
@Configuration // 表示当前类为配置类
@Import(DataSourceConfig.class) // 引入其他配置类
@ComponentScan // IoC解析器
@EnableTransactionManagement // 事务注解解析器
public class AppConfig {

    //创建N个Bean

    @Bean
    public DataSourceTransactionManager txManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
