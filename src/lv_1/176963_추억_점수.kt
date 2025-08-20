package lv_1

fun no176963(name: Array<String> = arrayOf("may", "kein", "kain", "radi"), yearning: IntArray = intArrayOf(5, 10, 1, 3), photo: Array<Array<String>> = arrayOf(arrayOf("may", "kein", "kain", "radi"), arrayOf("may", "kein", "brin", "deny"), arrayOf("kon", "kain", "may", "coni"))): IntArray {
    var answer = intArrayOf()

    // name과 yearning을 맵으로 연결
    val map = name.zip(yearning.toTypedArray()).toMap()

    photo.forEach { it ->
        var temp: Array<String> = arrayOf()
        var value = 0

        temp = it.filter { photo ->
            name.contains(photo)
        }.toTypedArray()

        temp.forEach {
            value += map[it]!!
        }

        answer += value
    }

    return answer
}