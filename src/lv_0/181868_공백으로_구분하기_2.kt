package lv_0

/*
* 단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
* my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
* */

fun main() {
    val my_string: String =  "i    love  you"
    val my_string2: String = "    programmers  "

    print(my_string.split("\\s+".toRegex()))
    print(my_string2.split("\\s+".toRegex()).filter { it.isNotEmpty() })
}