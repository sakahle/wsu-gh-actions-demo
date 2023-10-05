import com.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Should correctly add two integers")
    void testAdd(){
        assertEquals(10, Calculator.add(5, 5));
    }
}
