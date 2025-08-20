package lv_1

fun no131705(number: IntArray): Int {
    var answer = 0

    for(one in 0 until number.size - 2) {
        for(two in one + 1 until number.size - 1) {
            for(three in two + 1 until number.size) {
                if(number[one] + number[two] + number[three] == 0)
                    answer++
            }
        }
    }

    return answer
}