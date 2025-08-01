package lv_1

fun main() {
    val keyMap: Array<String> = arrayOf("ABACD", "BCEFD")
    val targets: Array<String> = arrayOf("ABCD","AABB")
    var answer: IntArray = intArrayOf()

    val tempMap = HashMap<Char, Int>()

    keyMap.forEach { s ->
        s.forEachIndexed { index, c ->
            if(tempMap.contains(c)) {
                if(tempMap.getValue(c) > index + 1) {
                    tempMap[c] = index + 1
                }
            } else {
                tempMap[c] = index + 1
            }
        }
    }

    targets.forEachIndexed { index, s ->
        answer += 0
        for(c in s) {
            if(tempMap.contains(c)) {
                answer[index] += tempMap.getValue(c)
            } else {
                answer[index] = -1
                break
            }
        }
    }

    println(answer.toList())
}