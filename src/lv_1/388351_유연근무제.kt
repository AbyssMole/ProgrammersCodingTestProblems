package lv_1

fun no388351(schedules: IntArray = intArrayOf(700, 800, 1100), timelogs: Array<IntArray> = arrayOf(intArrayOf(710, 2359, 1050, 700, 650, 631, 659), intArrayOf(800, 801, 805, 800, 759, 810, 809), intArrayOf(1105, 1001, 1002, 600, 1059, 1001, 1100)), startday: Int = 5): Int {
    var answer = 0;

    timelogs.forEachIndexed { index, times ->
        var limitime = schedules[index] + 10
        var dayOfTheWeek = startday
        var complete = true

        if(limitime % 100 > 59) {
            limitime += 100
            limitime -= 60
        }

        for(time in times) {
            if(dayOfTheWeek < 6) {
                if(time > limitime) {
                    complete = false
                    break
                }
            }

            if(dayOfTheWeek == 7) {
                dayOfTheWeek = 1
            } else {
                dayOfTheWeek++
            }

        }

        if(complete) {
            answer++
        }
    }

    return answer
}