package lv_0

// case) arr = [1, 2, 3, 100, 99, 98]
fun no181882(arr: IntArray): IntArray {
    return arr.map {
        if (it >= 50 && it % 2 == 0) {
            it / 2
        } else if(it < 50 && it % 2 != 0) {
            it * 2
        } else {
            it
        }
    }.toIntArray()
}
