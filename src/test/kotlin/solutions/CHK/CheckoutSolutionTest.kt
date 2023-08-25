package solutions.CHK

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckoutSolutionTest {
    @Test
    fun `checkout - should return the sum of all items per SKU` () {
        assertEquals(
            50,
            CheckoutSolution.checkout("A")
        )
        assertEquals(
            13,
            CheckoutSolution.checkout("A")
        )
    }

    @Test
    fun `checkout - returns -1 when invalid input`() {

    }

    @Test
    fun `checkout - return 0 when no item is found`() {

    }
}

