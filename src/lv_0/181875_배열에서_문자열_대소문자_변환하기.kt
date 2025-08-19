package lv_0

// case) strArr = ["AAA","BBB","CCC","DDD"]
fun no181875(strArr: Array<String>): Array<String> {
    return strArr.mapIndexed { index, str ->
        if(index % 2 == 0) str.lowercase() else str.uppercase()
    }.toTypedArray() // String Array 반환.
}