package lv_0

// case) myStr = "cabab"
fun no181862(myStr: String): Array<String> {
    var answer: Array<String> = arrayOf()

    // a, b, c를 구분자로 문자열을 나눔.
    answer = myStr.split("""[abc]""".toRegex()).filter { it.isNotEmpty() }.toTypedArray()

    if(answer.isEmpty()) {
        return arrayOf("EMPTY")
    } else {
        return answer
    }
}