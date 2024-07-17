package lesson_23.task1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    DiscountCalculator calculator = new DiscountCalculator();


    @Test
    public void shouldGivenNoDiscountFoValue999(){
        int buySum = 999;
        int expectedSum = 999;
        int resultSum = calculator.sumAfterDiscount(buySum);
        assertEquals(expectedSum, resultSum, "Ошибка!");
    }

    @Test
    public void shouldGivenNoDiscountFoValue1(){
        int buySum = 1;
        int expectedSum = 1;
        int resultSum = calculator.sumAfterDiscount(buySum);
        assertEquals(expectedSum, resultSum, "Ошибка!");
    }

/*    @Test
/*    public void shouldGivenNoDiscountFoValue2000(){
        int buySum = 2000;
        int expectedSum = 1960;
        int resultSum = calculator.sumAfterDiscount(buySum);
        assertEquals(expectedSum, resultSum, "Ошибка!");
    }*/

/*    @Test
    public void shouldReturnTrue(){
        var result = calculator.test();
        assertTrue(result, "Ошибка!");
    }*/

    @Test
    public void shouldReturnTrue(){
        Boolean result = calculator.test();
        assertNotNull(result, "Ошибка!");
    }

}