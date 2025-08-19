package lv_0

// case) myString = "AbCdEFG", pat = "dE"
fun no181872(myString: String, pat: String): String {
    val lastIndex = myString.lastIndexOf(pat)
        return myString.substring(0, lastIndex + pat.length)
}