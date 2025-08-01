package lv_0

/*
* 정수 배열 arr과 정수 n이 매개변수로 주어집니다.
* arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을,
* arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.
* */

fun main() {
    val arr = intArrayOf(49, 12, 100, 276, 33)
    val n = 27
    var answer = intArrayOf()

    if(arr.size % 2 == 0) {
        // arr의 길이가 짝수일 때
        answer = arr.mapIndexed { index, num ->
            if(index % 2 != 0) {
                num + n
            } else {
                num
            }
        }.toIntArray()
    } else {
        // arr의 길이가 홀수일 때
        answer = arr.mapIndexed { index, num ->
            if(index % 2 == 0) {
                num + n
            } else {
                num
            }
        }.toIntArray()
    }

    print(arr.size)
    print(answer.toList())
}