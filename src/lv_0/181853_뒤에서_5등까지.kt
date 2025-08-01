package lv_0

/*
* 정수로 이루어진 리스트 num_list가 주어집니다.
* num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
* */

fun main() {
    val num_list = intArrayOf(12, 4, 15, 46, 38, 1, 14)

    // 오름차순 정렬 후 앞 5개만 가져오기
    print(num_list.sortedArray().take(5))
}