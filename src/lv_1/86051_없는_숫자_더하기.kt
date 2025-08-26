package lv_1

// case1 : numbers = [1,2,3,4,6,7,8,0]
// case2 : numbers = [5,8,4,0,6,7,9]
fun no86051(numbers: IntArray = intArrayOf(5,8,4,0,6,7,9)): Int {
    var answer = 45

    numbers.forEach {
        answer = answer - it
    }

    return answer
}