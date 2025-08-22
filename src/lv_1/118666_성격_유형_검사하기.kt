package lv_1

import kotlin.math.abs

// case: survey = ["AN", "CF", "MJ", "RT", "NA"], choices = [5, 3, 2, 7, 5]
// case2: survey = ["TR", "RT", "TR"], choices = [7, 1, 3]
fun no118666(survey: Array<String> = arrayOf("TR", "RT", "TR"), choices: IntArray = intArrayOf(7, 1, 3)): String {
    var answer = ""
    val resultMap = hashMapOf<Char, Int>()
    resultMap['R'] = 0
    resultMap['T'] = 0
    resultMap['C'] = 0
    resultMap['F'] = 0
    resultMap['J'] = 0
    resultMap['M'] = 0
    resultMap['A'] = 0
    resultMap['N'] = 0

    for(choice in choices.withIndex()) {
        var score = 0

        when(choice.value) {
            1 -> score -= 3
            2 -> score -= 2
            3 -> score -= 1
            5 -> score += 1
            6 -> score += 2
            7 -> score += 3
        }

        if(score > 0) {
            resultMap[survey[choice.index].last()] = resultMap.getValue(survey[choice.index].last()) + abs(score)
        } else {
            resultMap[survey[choice.index].first()] = resultMap.getValue(survey[choice.index].first()) + abs(score)
        }
    }

    answer += if(resultMap.getValue('R') >= resultMap.getValue('T')) "R" else "T"
    answer += if(resultMap.getValue('C') >= resultMap.getValue('F')) "C" else "F"
    answer += if(resultMap.getValue('J') >= resultMap.getValue('M')) "J" else "M"
    answer += if(resultMap.getValue('A') >= resultMap.getValue('N')) "A" else "N"

    return answer
}