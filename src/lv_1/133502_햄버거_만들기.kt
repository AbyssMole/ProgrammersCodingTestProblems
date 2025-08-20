package lv_1

import java.util.Stack

// case) ingredient = [2, 1, 1, 2, 3, 1, 2, 3, 1]
fun no133502(ingredient: IntArray): Int {
    var answer = 0
    var temp = Stack<Int>()

    for(i in ingredient) {
        temp.push(i)

        if(temp.size > 3) {
            var ar = intArrayOf()

            // 마지막 4개 숫자 추출
            while (ar.size < 4) {
                ar += temp.pop()
            }

            // 후임선출이므로 뒤집어진 순서로 체크
            if(ar.contentEquals(intArrayOf(1, 3, 2, 1))) {
                answer++
            } else {
                // 뒤집어진 순서로 되돌림
                for(i in ar.reversed()) {
                    temp.push(i)
                }
            }
        }
    }

    return answer
}