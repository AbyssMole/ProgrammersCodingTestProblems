package lv_1

// case) k = 3, m = 4, score = [1, 2, 3, 1, 2, 3, 1]
fun no135808(k: Int, m: Int, score: IntArray): Int {
    var answer = 0

    val sortedScore = score.sortedDescending()

    for(i in m - 1 until sortedScore.size step m) {
        answer += sortedScore[i] * m
    }

    return answer
}