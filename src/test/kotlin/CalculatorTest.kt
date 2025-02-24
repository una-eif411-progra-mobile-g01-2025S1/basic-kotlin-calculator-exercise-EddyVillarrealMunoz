import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    // Test for Addition

    @Test
    fun testAdd() {
        assertEquals(8.0, calculator.add(5.0, 3.0))
        assertEquals(0.0, calculator.add(-5.0, 5.0))
        assertEquals(-8.0, calculator.add(-5.0, -3.0))
        assertEquals(5.5, calculator.add(2.5, 3.0))
    }

    // Test for Subtraction

    @Test
    fun testSub() {
        assertEquals(6.0, calculator.subtract(10.0, 4.0))
        assertEquals(-10.0, calculator.subtract(-5.0, 5.0))
        assertEquals(-2.0, calculator.subtract(-5.0, -3.0))
        assertEquals(-0.5, calculator.subtract(2.5, 3.0))
    }

    // Test for Multiplication

    @Test
    fun testMul() {
        assertEquals(15.0, calculator.multiply(5.0, 3.0))
        assertEquals(-25.0, calculator.multiply(-5.0, 5.0))
        assertEquals(15.0, calculator.multiply(-5.0, -3.0))
        assertEquals(7.5, calculator.multiply(2.5, 3.0))
    }

    // Test for Division

    @Test
    fun testDiv() {
        assertEquals(2.0, calculator.divide(10.0, 5.0))
        assertEquals(-1.0, calculator.divide(-5.0, 5.0))
        assertEquals(1.6666666666666667, calculator.divide(5.0, 3.0), 1e-9)
        assertThrows(IllegalArgumentException::class.java) {
            calculator.divide(10.0, 0.0)
        }
    }

    // Test for Division by Zero

    @Test
    fun testDivByZero(){
        assertThrows(IllegalArgumentException::class.java) {
            calculator.divide(10.0, 0.0)
        }
    }
}