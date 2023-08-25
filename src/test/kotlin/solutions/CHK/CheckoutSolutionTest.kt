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
            130,
            CheckoutSolution.checkout("AAA")
        )

        assertEquals(
            45,
            CheckoutSolution.checkout("BB")
        )

        assertEquals(
            45+130+50+20+15,
            CheckoutSolution.checkout("BBAAAACD")
        )

        assertEquals(
            200,
            CheckoutSolution.checkout("AAAAA")
        )

        assertEquals(
            45+130+50+20+15+40+40,
            CheckoutSolution.checkout("BBBAAAACDEE")
        )
    }

    @Test
    fun `checkout - returns -1 when invalid input`() {
        assertEquals(
            -1,
            CheckoutSolution.checkout("ZZAB")
        )
    }

    @Test
    fun `checkout - return 0 when no item is found`() {
        assertEquals(
            0,
            CheckoutSolution.checkout("")
        )
    }
}

