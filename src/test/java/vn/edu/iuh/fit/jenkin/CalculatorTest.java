package vn.edu.iuh.fit.jenkin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vn.edu.iuh.fit.jenkin.service.Calculator;

@SpringBootTest
public class CalculatorTest {
    @Autowired
    private Calculator calculator;
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assert calculator.add(1, 2) == 3;
    }

    @Test
    void testAdd2() {
        assert calculator.add(1, 3) == 4;
    }
}
