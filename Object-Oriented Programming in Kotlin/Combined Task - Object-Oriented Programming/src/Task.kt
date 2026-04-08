class Worker(val name: String, val hourlyRate: Int) {
    init {
        if (hourlyRate <= 0) {
            throw IllegalArgumentException("Погодинна ставка має бути більшою за 0")
        }
    }

    var hoursWorked: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    val salary: Int
        get() = hourlyRate * hoursWorked
}