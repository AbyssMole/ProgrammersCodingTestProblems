package lv_1

// case) 2, 1, 20
// case2) 3, 1, 20
fun no132267(a: Int, b: Int, n: Int): Int {
    var answer = 0
    var emptyBottle = n

    while (emptyBottle >= a) {
        answer += (emptyBottle / a) * b
        emptyBottle = ((emptyBottle / a) * b) + (emptyBottle % a)
    }

    return answer
}