package lv_0

/*
* 알파벳으로 이루어진 문자열 myString과 pat이 주어집니다.
* myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.

* 단, 알파벳 대문자와 소문자는 구분하지 않습니다.
* */

fun main() {
    val myString: String = "AbCdEfG"
    val pat: String = "aBc"
    var answer = 0

    if(myString.lowercase().contains(pat.lowercase()))
        answer = 1

    print(answer)
}