package lv_0

// case) num_list = [3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1]
fun no181879(num_list: IntArray): Int {
    return if(num_list.count() > 10) {
        // 원소들 더하기
        num_list.sum()
    } else {
        // 원소들 곱하기
        num_list.reduce { acc, i -> acc * i }
    }
}