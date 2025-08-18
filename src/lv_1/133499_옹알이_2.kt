package lv_1

fun no133499(babbling: Array<String>): Int {
    var answer = 0

    for(s in babbling) {

        // 같은 발음이 연속으로 나오는 경우 체크
        if(s.contains("ayaaya|yeye|woowoo|mama".toRegex())) {
            continue
        }

        if(s.replace("aya|ye|woo|ma".toRegex(), "").isEmpty()) {
            answer++
        }
    }

    return answer
}