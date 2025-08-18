package lv_0

// case) strArr = ["a", "bc", "d", "efg", "hi"]
fun no181855(strArr: Array<String>): Int {
    return strArr.groupBy { it.length }.maxOf { it.value.size }
}