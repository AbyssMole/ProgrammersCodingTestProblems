package lv_1

// case: id_list = ["muzi", "frodo", "apeach", "neo"], report = ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"], k = 2
// case2 : id_list = ["con", "ryan"], report = ["ryan con", "ryan con", "ryan con", "ryan con"], k = 3
fun no92334(id_list: Array<String> = arrayOf("muzi", "frodo", "apeach", "neo"), report: Array<String> = arrayOf("muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"), k: Int = 2): IntArray {
    var answer = intArrayOf()
    val distinctReport = report.distinct().map { it.split(" ") } // 동일한 신고내역 제거, id 분리
    val reportCountMap = hashMapOf<String, Int>()
    id_list.forEach {
        reportCountMap[it] = 0
    }

    distinctReport.forEach {
        reportCountMap[it.last()] = reportCountMap[it.last()]!! + 1
    }

    id_list.forEach { id ->
        answer += distinctReport.count {
            it.first() == id && reportCountMap[it.last()]!! >= k
        }
    }

    return answer
}
