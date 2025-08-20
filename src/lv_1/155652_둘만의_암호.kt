package lv_1

fun no155652(s: String = "aukks", skip: String = "wbqd", index: Int = 5): String {
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

    return answer
}