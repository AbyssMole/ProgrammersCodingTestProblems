package lv_1

fun main() {
    val s = "abracadabraa"
    var answer = 0
    var x: Char? = null
    var xCount = 0
    var zCount = 0

    for(c in s.withIndex()) {
        if(x == null) {
            x = c.value
            xCount++
        } else {
            if(x == c.value) {
                xCount++
            } else {
                zCount++
            }
        }

        if(xCount == zCount) {
            answer++
            x = null
        }

        if(c.index == s.lastIndex && xCount > 0) {
            answer++
        }
    }

    print(answer)
}