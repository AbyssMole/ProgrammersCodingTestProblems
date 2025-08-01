package lv_1

fun main() {
    val t = "500220839878"
    val p = "7"
    var answer = 0

    for(i in 0 until t.length - p.length) {
        if(t.substring(i, i + p.length).toLong() <= p.toLong()) {
            answer++
        }
    }

    print(answer)
}