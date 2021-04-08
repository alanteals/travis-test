import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CalculatorTest {

    @Test
    fun `Adding 3 and 2 should be equal to 5`() {
        val calculator = Calculator()
        Assertions.assertEquals(5, calculator.add(3, 2))
    }
}