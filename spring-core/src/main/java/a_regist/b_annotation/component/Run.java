package a_regist.b_annotation.component;

import a_regist.a_xml.cheatsheet.CheatSheet;
import java.time.LocalDate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/regist/annotation/component/application-context.xml");

        Developer developer = context.getBean("developer", Developer.class);
        System.out.println(developer);

        JdbcProperties jdbcProperties = context.getBean("jdbcProperties", JdbcProperties.class);
        System.out.println(jdbcProperties);

        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println(jdbcTemplate);
    }
}
