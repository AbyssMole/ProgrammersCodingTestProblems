package lv_1

// case1: sizes = [[60, 50], [30, 70], [60, 30], [80, 40]], result = 4000
// case2: sizes = [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]], result = 120
// case3: sizes = [[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]], result = 133
fun no86491(sizes: Array<IntArray> = arrayOf(intArrayOf(14, 4), intArrayOf(19, 6), intArrayOf(6, 16), intArrayOf(18, 7), intArrayOf(7, 11))): Int {
    var answer = 0
    var big = 0
    var small = 0

    sizes.forEach {
        it.sorted().let {
            if(big < it.first()) big = it.first()
            if(small < it.last()) small = it.last()
        }
    }

    answer = big * small

    return answer
}