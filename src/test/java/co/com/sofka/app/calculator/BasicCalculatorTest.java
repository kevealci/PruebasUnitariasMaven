package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing subtraction: 2-1=1")
    public void subtract() {
        // Arrange
        Long number1 = 2L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.subtract(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several subtractions")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "10,    1,   9",
            "4,    2,   2",
            "59,  51, 8",
            "201,  100, 101"
    })
    public void severalSubtraction(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.subtract(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing multiply: 8*2=16")
    public void multiply() {
        // Arrange
        Long number1 = 8L;
        Long number2 = 2L;
        Long expectedValue = 16L;

        // Act
        Long result = basicCalculator.multiply(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several multiplications")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "10,    1,   10",
            "4,    0,   0",
            "20,  3, 60",
            "15,  6, 90"
    })
    public void severalMultiplication(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiply(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing division: 8/2=4")
    public void divide() {
        // Arrange
        Double number1 = 8D;
        Double number2 = 2D;
        Double expectedValue = 4D;

        // Act
        Double result = basicCalculator.divide(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several divisions")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "10,    1,   10",
            "9,    2,   4.5",
            "20,  4, 5",
            "10,  4, 2.5"
    })
    public void severalDivisions(Double first, Double second, Double expectedResult) {
        assertEquals(expectedResult, basicCalculator.divide(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }



}