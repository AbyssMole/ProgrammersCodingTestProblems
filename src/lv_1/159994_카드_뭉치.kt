package lv_1

import kotlin.math.PI

fun main() {
    val cards1: Array<String> = arrayOf("i", "water", "drink")
    val cards2: Array<String> = arrayOf("want", "to")
    val goal: Array<String> = arrayOf("i", "want", "to", "drink", "water")
    var answer = "Yes"

    var count1 = 0
    var count2 = 0

    for(word in goal) {
        if(cards1.contains(word)) {
            if(cards1.indexOf(word) - count1 <= 1) {
                count1 = cards1.indexOf(word)
            } else {
                answer = "NO"
                break
            }
        }

        if(cards2.contains(word)) {
            if(cards2.indexOf(word) - count2 <= 1) {
                count2 = cards2.indexOf(word)
            } else {
                answer = "NO"
                break
            }
        }
    }

    println(answer)
}