package lv_1

fun main() {
    print(solution(intArrayOf(1, 3, 4, 6)))
}

fun solution(food: IntArray): String {
    var answer = ""

    for(i in 1 until food.size) {
        if(food[i] < 2) {
            continue
        }

        for(j in 0 until food[i] / 2) {
            answer += i
        }
    }

    answer += "0"

    for(i in food.size - 1 downTo 1) {
        if(food[i] < 2) {
            continue
        }

        for(j in 0 until food[i] / 2) {
            answer += i
        }
    }

    return answer
}