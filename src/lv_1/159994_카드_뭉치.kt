package lv_1

fun no159994(cards1: Array<String> = arrayOf("i", "water", "drink"), cards2: Array<String> = arrayOf("want", "to"), goal: Array<String> = arrayOf("i", "want", "to", "drink", "water")): String {
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

    return answer
}