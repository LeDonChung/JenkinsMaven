package vn.edu.iuh.fit.jenkin;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsMavenApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void testHello() {
        System.out.println("Hello Jenkins Maven");
        assert true;
    }


}
