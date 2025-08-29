package lv_1

import kotlin.math.sqrt

// case1 : left = 13, fight = 17, result = 43
// case2 : left = 24, fight = 27, result = 52
fun no77884(left: Int = 13, right: Int = 17): Int {
    var answer = 0

    for(num in left..right) {
        var count = 0

        for(i in 1..sqrt(num.toDouble()).toInt()) {
            if(num % i == 0) {
                count++

                if(num / i != i) {
                    count++
                }
            }
        }


        if(count % 2 == 0) {
            answer += num
        } else {
            answer -= num
        }
    }

    return answer
}