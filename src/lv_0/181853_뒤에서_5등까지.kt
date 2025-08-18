package lv_0

// case) num_list = [12, 4, 15, 46, 38, 1, 14]
fun no181853(num_list: IntArray): List<Int> {
    // 오름차순 정렬 후 앞 5개만 가져오기
    return num_list.sortedArray().take(5)
}