package lv_0

// case) arr = [0, 1, 1, 2, 2, 3], 3
fun no181858(arr: IntArray, k: Int): IntArray {
    var answer = intArrayOf()

    // 중복값 제거
    answer = arr.distinct().toIntArray()

    // 중복값 제거된 배열 길이에 따른 처리
    if(answer.size < k) {
        for(i in answer.size until k) {
            answer += -1
        }
    }
    else {
        answer = answer.dropLast(answer.size - k).toIntArray()
    }

    return answer
}