package lv_1

fun main() {
    val s = "aukks"
    val skip = "wbqd"
    val index = 5
    var answer = ""

    for(c in s) {
        var nextChar = c

        for(i in 1..index) {
            nextChar++

            if(nextChar.code > 122) {
                nextChar = 'a'
            }

            while (skip.contains(nextChar)) {
                nextChar++

                if(nextChar.code > 122) {
                    nextChar = 'a'
                }
            }
        }

        answer += nextChar
    }

    println(answer)
}