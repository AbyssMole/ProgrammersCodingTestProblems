package lv_1

fun main() {
    val n = 8
    val m = 4
    val section = intArrayOf(1, 2, 3, 6)
    var answer = 0

    var stack = 0

    if(m == 1) {
        answer = section.size
    } else if(m == n) {
        answer = 1
    } else {
        while (stack < section.size) {
            var first = section[stack]

            for(i in 0 until m) {
                if(section.contains(first + i)) {
                    stack++
                }
            }

            answer++
        }
    }

    print(answer)
}