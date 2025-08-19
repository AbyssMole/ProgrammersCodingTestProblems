package lv_0

// case) arr = [1, 2, 3, 100, 99, 98]
fun no181881(arr: IntArray): Int {
    var answer = 0
    var beforeArray: IntArray = arr
    var nextArray: IntArray = intArrayOf()

    while (!beforeArray.contentEquals(nextArray)) {
        if(answer != 0) {
            beforeArray = nextArray
        }

        nextArray = beforeArray.map {
            if (it >= 50 && it % 2 == 0) {
                it / 2
            } else if(it < 50 && it % 2 != 0) {
                it * 2 + 1
            } else {
                it
            }
        }.toIntArray()

        answer++
    }

    // 마지막 변환 횟수의 -1을 리턴
    return answer - 1
}