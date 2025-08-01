package lv_0

/*
* 정수가 담긴 리스트 num_list가 주어질 때,
* 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을
* 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
* */

fun main() {
    val num_list: IntArray = intArrayOf(3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1)
    var answer: Int = 0

    if(num_list.count() > 10) {
        // 원소들 더하기
        answer = num_list.sum()
    } else {
        // 원소들 곱하기
        answer = num_list.reduce { acc, i -> acc * i }
    }

    print(answer)
}