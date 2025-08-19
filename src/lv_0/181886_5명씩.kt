package lv_0

// case) names = ["nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"]
fun no181886(names: Array<String>): Array<String> {
    var answer: Array<String> = arrayOf()

    // 0부터 5씩 증가시키면서 반복
    for(i in names.indices step 5) {
        answer += names[i]
    }

    return answer
}