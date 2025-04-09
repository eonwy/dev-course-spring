package c_el;

import c_el.bean.JdbcProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class C_BeanRef {

    @Value("#{transactionManager.jdbcProperties}")
    private JdbcProperties jdbcProperties;

    @Override
    public String toString() {
        return "C_BeanRef{" +
            "jdbcProperties=" + jdbcProperties +
            '}';
    }
}
