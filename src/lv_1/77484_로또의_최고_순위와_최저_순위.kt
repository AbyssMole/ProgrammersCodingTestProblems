package lv_1

// case1 : lottos = [44, 1, 0, 0, 31, 25], win_nums = [31, 10, 45, 1, 6, 19], result = [3, 5]
fun no77484(lottos: IntArray = intArrayOf(44, 1, 0, 0, 31, 25), win_nums: IntArray = intArrayOf(31, 10, 45, 1, 6, 19)): IntArray {
    var best = 0
    var worst = 0

    best = getRank(lottos.count { win_nums.contains(it) } + lottos.count{ it == 0 })
    worst = getRank(lottos.count { win_nums.contains(it) })

    return intArrayOf(best, worst)
}

fun getRank(containCount: Int): Int {
    return when (containCount) {
        2 -> 5
        3 -> 4
        4 -> 3
        5 -> 2
        6 -> 1
        else -> 6
    }
}