package lv_0

// case) myString = "banana", pat = "ana"
fun no181871(myString: String, pat: String): Int {
    var answer = 0
    var tempString = myString

    while (tempString.contains(pat)) {
        answer++
        tempString = tempString.substring(tempString.indexOf(pat) + 1)
    }

    return answer
}