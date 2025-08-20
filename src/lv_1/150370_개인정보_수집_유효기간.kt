package lv_1

import java.text.SimpleDateFormat
import java.util.Calendar

// case) today = "2022.05.19", terms = ["A 6", "B 12", "C 3"], privacies = ["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"]
fun no150370(today: String = "2022.05.19", terms: Array<String> = arrayOf("A 6", "B 12", "C 3"), privacies: Array<String> = arrayOf("2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C")): IntArray {
    var answer = intArrayOf()

    val todayToDate = Calendar.getInstance()
    todayToDate.time = SimpleDateFormat("yyyy.MM.dd").parse(today)

    val hashTerms = hashMapOf<String, Int>()

    terms.forEach {
        val splitString = it.split(" ")
        hashTerms.put(splitString[0], splitString[1].toInt())
    }

    privacies.forEachIndexed { index, string ->
        val privacy = string.split(" ")
        val privacyDate = Calendar.getInstance()
        privacyDate.time = SimpleDateFormat("yyyy.MM.dd").parse(privacy[0])

        hashTerms.get(privacy[1])?.let {
            privacyDate.add(Calendar.MONTH, it)
        }

        if(privacyDate.time <= todayToDate.time) {
            answer += index + 1
        }
    }

    return answer
}