package lv_1

// case) X = "100", Y = "2345", result = "-1"
// case2) X = "100, Y = "123450", result = "10"
fun no131128(X: String = "79", Y: String = "103450"): String {
    var answer = StringBuffer()

    for(c in '9' downTo '0') {
        val xCount = X.filter { it == c }.length
        val yCount = Y.filter { it == c }.length

        repeat(Math.min(xCount, yCount)) {
            answer.append(c)
        }
    }

    if(answer.isNotEmpty() && answer.count { it == '0' } == answer.length) {
        answer.delete(1, answer.length)
    }

    return if(answer.isNotEmpty()) answer.toString() else "-1"
}