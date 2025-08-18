package lv_0

// case) myString = "oxooxoxxox"
fun no181867(myString: String): IntArray {
    return myString.split("x").map { it.length }.toIntArray()
}