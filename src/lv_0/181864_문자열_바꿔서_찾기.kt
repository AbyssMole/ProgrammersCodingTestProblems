package lv_0

// case) myString = "ABBAA", pat = "AABB"
fun no181864(myString: String, pat: String): Int {
    // answer에 A와 B를 뒤집어서 합친 문자열 저장.
    var answer = myString
        .map { if(it == 'A') 'B' else 'A' }
        .joinToString("")

    return if(answer.contains(pat)) 1 else 0
}