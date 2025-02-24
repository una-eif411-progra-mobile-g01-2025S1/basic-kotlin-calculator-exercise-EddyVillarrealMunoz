import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun testAddition() {
        assertEquals(8.0, calculator.add(5.0, 3.0))
    }

    @Test
    fun testSub(){
        assertEquals(6.0, calculator.subtract(10.0, 4.0))
    }

    @Test
    fun testMul(){
        assertEquals(15.0, calculator.multiply(5.0, 3.0))
    }

    @Test
    fun testDiv(){
        assertEquals(2.0, calculator.divide(10.0, 5.0))
    }

    @Test
    fun testDivByZero(){
        assertThrows(IllegalArgumentException::class.java) {
            calculator.divide(10.0, 0.0)
        }
    }
}