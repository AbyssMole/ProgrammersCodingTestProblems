package lv_0

// case) arr = [0, 1, 2, 3, 4], queries = [[0, 1], [1, 2], [2, 3]]
fun no181883(arr: IntArray, queries: Array<IntArray>): IntArray {
    var answer: IntArray = intArrayOf()

    queries.forEach { query ->
        for(i in query[0]..query[1]) {
            arr[i] += 1
        }
    }

    answer = arr.copyOf()

    return answer
}