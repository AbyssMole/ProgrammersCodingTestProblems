package lv_0

/*
* 문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
* */

fun main() {
    val myString = "banana"
    val pat = "ana"
    var tempString = myString
    var answer = 0

    while (tempString.contains(pat)) {
        answer++
        tempString = tempString.substring(tempString.indexOf(pat) + 1)
    }

    print(answer)
}