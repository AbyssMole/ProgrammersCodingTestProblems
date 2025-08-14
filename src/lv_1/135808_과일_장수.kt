package lv_1

fun main() {
    val k = 3
    val m = 4
    val score = intArrayOf(1, 2, 3, 1, 2, 3, 1)
    var answer = 0

    val sortedScore = score.sortedDescending()

    for(i in m - 1 until sortedScore.size step m) {
        answer += sortedScore[i] * m
    }

    print(answer)
}