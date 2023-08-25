package solutions.CHK

/**
 * +------+-------+----------------+
 * | Item | Price | Special offers |
 * +------+-------+----------------+
 * | A    | 50    | 3A for 130     |
 * | B    | 30    | 2B for 45      |
 * | C    | 20    |                |
 * | D    | 15    |                |
 * +------+-------+----------------+
 */
object CheckoutSolution {
    private val pricesPerSKU = mapOf(
        'A' to 50,
        'B' to 30,
        'C' to 20,
        'D' to 15
    )

    fun checkout(skus: String): Int {
        val skusCount = mutableMapOf<Char, Int>()
        val skusList = skus.toCharArray()
        val totalPrice = 0

        skusList.forEach { sku ->
            if (pricesPerSKU[sku] == null) {
                return -1
            }

            if (skusCount[sku] == null) {
                skusCount[sku] = 0
            } else {
                skusCount[sku] = skusCount[sku]!! + 1
            }
        }

        skusCount.forEach { sku, amount ->

        }

        return totalPrice
    }
}




