package lv_0

/*
* 정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고,
* 50보다 작은 홀수라면 2를 곱합니다. 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
* */

fun main() {
    val arr: IntArray = intArrayOf(1, 2, 3, 100, 99, 98)
    var answer: IntArray = intArrayOf()

    print(arr.map {
        if (it >= 50 && it % 2 == 0) {
            it / 2
        } else if(it < 50 && it % 2 != 0) {
            it * 2
        } else {
            it
        }
    }.toIntArray())
}
