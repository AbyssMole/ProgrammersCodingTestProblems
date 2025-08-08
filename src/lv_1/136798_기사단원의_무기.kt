package lv_1

import kotlin.math.sqrt

fun main() {
    val number = 100000
    val limit = 100
    val power = 2
    var answer = 0

    for(num in 1..number) {
        var count = 0

        for(i in 1..sqrt(num.toDouble()).toInt()) {
            if(num % i == 0) {
                count++

                if(num / i != i) {
                    count++
                }
            }
        }

        print("$count, ")
        answer += if(count > limit) power else count
    }

    println()
    print(answer)
}