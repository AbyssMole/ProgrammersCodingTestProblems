package lv_1

fun main() {
    val k = 3
    val scores = intArrayOf(10, 100, 20, 150, 1, 100, 200)
    var answer = intArrayOf()

    var ranking = intArrayOf()

    for(score in scores) {
        if(ranking.size < k) {
            ranking += score
        } else {
            if(ranking.count { it < score } != 0) {
                ranking[0] = score
            }
        }

        ranking.sort()
        answer += ranking.min()
    }

    print(answer.toList())
}