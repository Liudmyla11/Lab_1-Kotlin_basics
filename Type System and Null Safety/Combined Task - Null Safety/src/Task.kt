fun generateGreeting(name: String?): String {
    return "Welcome, ${name?.takeIf { it.isNotEmpty() } ?: "Guest"}!"
}