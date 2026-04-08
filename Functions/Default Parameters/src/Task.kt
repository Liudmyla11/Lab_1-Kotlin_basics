fun greetUser(name: String = "Guest"): String {
    return "Welcome, $name!"
}

fun callGreet(): String {
    return greetUser()
}