package lv_0

// case) myString = "abstract algebra"
fun no181874(myString: String): String {
    return myString.uppercase().replace("[B-Z]".toRegex()) { it.value.lowercase() }
}