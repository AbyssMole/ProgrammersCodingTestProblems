package lv_0

// case) arr = [3, 2, 4, 1, 3], flag = [true, false, true, false, false]
fun no181860(arr: IntArray, flag: BooleanArray): IntArray {
    var answer = intArrayOf()

    flag.forEachIndexed { index, flag ->
        if(flag) {
            for(i in 0 until arr[index] * 2) {
                answer += arr[index]
            }
        } else {
            answer = answer.dropLast(arr[index]).toIntArray()
        }
    }

    return answer
}