package lv_0

// case) myString = "axbxcxdx"
fun no181866(myString: String): Array<String> {
    return myString.split("x")
        .filter { it.isNotEmpty() }
        .sorted()
        .toTypedArray()
}