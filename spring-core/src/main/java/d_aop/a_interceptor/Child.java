package d_aop.a_interceptor;

import org.springframework.stereotype.Component;

@Component
public class Child implements Developer{

    public void develop() {
        System.out.println("baby가 자바로 개발");
    }
}
