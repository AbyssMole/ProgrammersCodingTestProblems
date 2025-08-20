package lv_1

// case) t = "500220839878", p = "7"
fun no147355(t: String, p: String): Int {
    var answer = 0

    for(i in 0 until t.length - p.length) {
        if(t.substring(i, i + p.length).toLong() <= p.toLong()) {
            answer++
        }
    }

    return answer
}