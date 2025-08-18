package lv_0

// case) arr = [5, 1, 4]
fun no181861(arr: IntArray): IntArray {
    var answer = intArrayOf()

    arr.forEach {
        for(i in 0 until it) {
            answer += it
        }
    }

    return answer
}