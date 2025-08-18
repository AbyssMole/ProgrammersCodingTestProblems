package lv_0

// case) arr = [1, 2, 3, 4, 5, 6]
fun no181857(arr: IntArray): IntArray {
    return solution(arr, 1) // 2^0 부터 시작
}

fun solution(arr: IntArray, mod: Int): IntArray {
    if(arr.size <= mod) {
        var result = arr
        while (result.size != mod) {
            result = result.plus(0)
        }

        return result
    } else {
        // 재귀호출
        return solution(arr, mod * 2)
    }
}