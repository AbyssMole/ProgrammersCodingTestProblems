package lv_0

// case) arr = [49, 12, 100, 276, 33]
fun no181854(arr: IntArray, n: Int): IntArray {
    var answer = intArrayOf()

    if(arr.size % 2 == 0) {
        // arr의 길이가 짝수일 때
        answer = arr.mapIndexed { index, num ->
            if(index % 2 != 0) {
                num + n
            } else {
                num
            }
        }.toIntArray()
    } else {
        // arr의 길이가 홀수일 때
        answer = arr.mapIndexed { index, num ->
            if(index % 2 == 0) {
                num + n
            } else {
                num
            }
        }.toIntArray()
    }

    return answer
}