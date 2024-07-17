package lesson_23.task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void divisionByZero() {

        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                calculator.div(10, 0);
            }
        };
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> calculator.div(10,0));
        assertEquals("Делитель не может быть 0", runtimeException.getMessage());
    }

}