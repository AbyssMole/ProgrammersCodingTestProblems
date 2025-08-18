package lv_0

// case) binomial = "43 + 12"
fun no181865(binomial: String): Int {
    binomial.split(" ").let {
        var answer = 0
        when(it[1]) {
            "+" -> { answer = it[0].toInt() + it[2].toInt() }
            "-" -> { answer = it[0].toInt() - it[2].toInt() }
            "*" -> { answer = it[0].toInt() * it[2].toInt() }
        }

        return answer
    }
}