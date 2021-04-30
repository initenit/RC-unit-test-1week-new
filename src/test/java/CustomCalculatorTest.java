import junit.framework.TestCase;
import org.junit.Test;

public class CustomCalculatorTest extends TestCase {

    private CustomCalculator customCalculator;

    // 더하기 테스트
    @Test
    public void testAdd() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10, 10);
        // 테스트 코드 작성
        assertTrue(result == 20);
        assertFalse(result == 19);
    }

    // 빼기 테스트
    @Test
    public void testSubtract() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(10, 10);
        // 테스트 코드 작성
        assertTrue(result == 0);
        assertFalse(result == 1);
    }

    // 곱하기 테스트
    @Test
    public void testMultiply() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(10, 10);
        // 테스트 코드 작성
        assertTrue(result == 100);
        assertFalse(result == 99);
    }

    // 나누기 테스트
    @Test
    public void testDivide() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(10, 10);
        // 테스트 코드 작성
        assertTrue(result == 1);
        assertFalse(result == 2);
    }
}