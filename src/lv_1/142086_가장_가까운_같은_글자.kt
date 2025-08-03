package lv_1

fun main() {
    val s = "banana"
    val answer = MutableList(s.length) { 0 }

    for(i in 0 until s.length) {
        if(answer[i] == 0) {
            answer[i] = -1

            val c = s[i]
            var count = 0

            for(j in i + 1 until s.length) {
                count++

                if(s[j] == c) {
                    answer[j] = count
                    count = 0
                }
            }
        }

        continue
    }

    println(answer)
}