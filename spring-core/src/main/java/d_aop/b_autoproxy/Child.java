package d_aop.b_autoproxy;

import org.springframework.stereotype.Component;

@Component
public class Child implements Developer {

    public String develop() {
        System.out.println("baby가 자바로 개발");
        throw new RuntimeException("kawaii 실수 발생");
    }
}
