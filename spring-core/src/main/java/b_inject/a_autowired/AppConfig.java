package b_inject.a_autowired;

import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public JdbcProperties mysqlProperties() {
        Properties properties = new Properties();
        properties.put("db", "mysql");
        properties.put("user", "root");
        return new JdbcProperties(properties);
    }

    @Bean
    public JdbcProperties oracleProperties() {
        Properties properties = new Properties();
        properties.put("db", "oracle");
        properties.put("user", "oracle");
        return new JdbcProperties(properties);
    }
}
