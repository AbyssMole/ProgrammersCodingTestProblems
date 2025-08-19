package lv_0

// case) numbers = [34, 5, 71, 29, 100, 34], n = 123
fun no181884(numbers: IntArray, n: Int): Int {
    var answer: Int = 0

    for(i in numbers) {
        answer += i

        if(answer > n) {
            break
        }
    }

    return answer
}