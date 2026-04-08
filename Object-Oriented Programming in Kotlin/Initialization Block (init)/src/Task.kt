class Product(val price: Double) {
    init {
        if (price < 0) {
            throw IllegalArgumentException("Invalid price: $price. Price cannot be negative")
        }
    }
}