package lv_0

/*
* 정수 리스트 num_list가 주어집니다.
* 가장 첫 번째 원소를 1번 원소라고 할 때, 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요.
* 두 값이 같을 경우 그 값을 return합니다.
*/

fun main() {
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

    if (odd > even) {
        answer = odd
    } else {
        answer = even
    }

    print(answer)
}