package lv_0

/*
* 문자열 배열 strArr이 주어집니다.
* strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
* */

fun main() {
    val strArr = arrayOf("a", "bc", "d", "efg", "hi")
    var answer = strArr.groupBy { it.length }.maxOf { it.value.size }

    print(answer)
}