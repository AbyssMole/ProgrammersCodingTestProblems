package lv_0

// case) num_list = [4, 2, 6, 1, 7, 6]
fun no181887(num_list: IntArray): Int {
    val num_list = intArrayOf(4, 2, 6, 1, 7, 6)
    var answer = 0
    var odd = 0 //홀수
    var even = 0 // 짝수

    for (i in num_list.indices) {
        if (i % 2 == 0) {
            // 홀수 번째 원소
            odd += num_list[i]
        } else {
            // 짝수 번째 원소
            even += num_list[i]
        }
    }

    return if (odd > even) odd else even
}