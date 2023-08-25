package solutions.CHK

data class SpecialDiscount(
    var numberOfItems: Int,
    var discountPrice: Int
) {
    fun calculateTotal(amount: Int, normalPrice: Int): Int {
        val nonDiscountedAmount = amount % numberOfItems
        val discountedAmount = amount / numberOfItems
        (normalPrice * nonDiscountedAmount) +
            (discountedAmount * discountPrice)
    }
}

