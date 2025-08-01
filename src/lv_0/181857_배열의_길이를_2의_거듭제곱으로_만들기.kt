package lv_0

/*
* 정수 배열 arr이 매개변수로 주어집니다.
* arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
* arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
* */

fun main() {
    val arr: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)
    var answer: IntArray = intArrayOf()

    answer = solution(arr, 1) // 2^0 부터 시작

    print(answer.toList())
}

fun solution(arr: IntArray, mod: Int): IntArray {
    if(arr.size <= mod) {
        var result = arr
        while (result.size != mod) {
            result = result.plus(0)
        }

        return result
    } else {
        // 재귀호출
        return solution(arr, mod * 2)
    }
}