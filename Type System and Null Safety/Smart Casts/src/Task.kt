fun toUpperCaseSafe(text: String?): String {
    if (text != null) {
        return text.uppercase()
    } else {
        return "EMPTY"
    }
}