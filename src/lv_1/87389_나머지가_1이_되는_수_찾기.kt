package lv_1

// case: n = 10
// case2: n = 12
fun no87389(n: Int = 12): Int {
    var answer = 0

    for(i in 1..n) {
        if(n % i == 1) {
            answer = i
            break
        }
    }

    return answer
}