package lv_0

/*
* 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e] 꼴입니다.
* 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 arr[i]에 1을 더합니다.
* 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
* */

fun main() {
    val arr: IntArray = intArrayOf(0, 1, 2, 3, 4)
    val queries: Array<IntArray> = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 3))
    var answer: IntArray = intArrayOf()

    queries.forEach { query ->
        for(i in query[0]..query[1]) {
            arr[i] += 1
        }
    }

    answer = arr.copyOf()

    print(answer.toList())
}