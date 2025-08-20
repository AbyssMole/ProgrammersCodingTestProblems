package lv_1

// case) k = 3, scores = [10, 100, 20, 150, 1, 100, 200]
fun no138477(k: Int, scores: IntArray): IntArray {
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

    return answer
}