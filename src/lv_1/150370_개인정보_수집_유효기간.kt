package lv_1

import java.text.SimpleDateFormat
import java.util.Calendar

fun main() {
    val today = "2022.05.19"
    val terms = arrayOf("A 6", "B 12", "C 3")
    val privacies = arrayOf("2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C")
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

    println(answer.toList())
}