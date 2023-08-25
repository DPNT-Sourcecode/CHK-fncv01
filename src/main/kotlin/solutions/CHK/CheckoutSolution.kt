package solutions.CHK

/**
 * +------+-------+------------------------+
 * | Item | Price | Special offers         |
 * +------+-------+------------------------+
 * | A    | 50    | 3A for 130, 5A for 200 |
 * | B    | 30    | 2B for 45              |
 * | C    | 20    |                        |
 * | D    | 15    |                        |
 * | E    | 40    | 2E get one B free      |
 * +------+-------+------------------------+
 */
object CheckoutSolution {
    private val pricesPerSKU = mapOf(
        'A' to 50,
        'B' to 30,
        'C' to 20,
        'D' to 15,
        'E' to 40
    )
    private val specialDiscounts = mapOf(
        'A' to SpecialDiscount(mapOf(3 to 130, 5 to 200)),
        'B' to SpecialDiscount(mapOf(2 to 45)),
    )
    private val freeItems = mapOf(
        'E' to FreeItem(2, 'B', 1)
    )

    fun checkout(skus: String): Int {
        val skusList = skus.toCharArray()

        return calculatePrices(skusList)
    }

    private fun calculatePrices(skusList: CharArray): Int {
        val skusCount = mutableMapOf<Char, Int>()
        var totalPrice = 0

        skusList.forEach { sku ->
            if (pricesPerSKU[sku] == null) {
                return -1
            }

            if (skusCount[sku] == null) {
                skusCount[sku] = 1
            } else {
                skusCount[sku] = skusCount[sku]!! + 1
            }
        }

        skusCount.forEach { (sku, amount) ->
            val specialDiscount = specialDiscounts[sku]
            totalPrice += if (specialDiscount != null) {
                specialDiscount.calculateTotal(amount, pricesPerSKU[sku]!!)
            } else {
                pricesPerSKU[sku]!! * amount
            }
        }

        return totalPrice
    }
}




