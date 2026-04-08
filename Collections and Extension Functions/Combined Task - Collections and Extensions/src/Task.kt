fun List<String>.getImportantWords(): List<String> {
    return this.filter { it.startsWith("K") }
        .map { it.uppercase() }
}