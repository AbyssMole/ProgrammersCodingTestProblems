package lv_0

// case) myString = "AbCdEfG", pat = "aBc"
fun no181878(myString: String, pat: String): Int {
    return if(myString.lowercase().contains(pat.lowercase())) 1 else 0
}