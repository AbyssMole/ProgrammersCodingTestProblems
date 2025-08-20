package lv_1

import kotlin.math.sqrt

// case) number = 100000, limit = 100, power = 2
fun no136898(number: Int = 100000, limit: Int = 100, power: Int = 2): Int {
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


        answer += if(count > limit) power else count
    }

    return answer
}