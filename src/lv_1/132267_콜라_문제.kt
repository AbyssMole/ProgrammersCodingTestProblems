package lv_1

// case) a = 2, b = 1, n = 20
// case2) a = 3, b = 1, n = 20
fun no132267(a: Int, b: Int, n: Int): Int {
    var answer = 0
    var emptyBottle = n

    while (emptyBottle >= a) {
        answer += (emptyBottle / a) * b
        emptyBottle = ((emptyBottle / a) * b) + (emptyBottle % a)
    }

    return answer
}