package lv_0

// case) strArr = ["and","notad","abcd"]
fun no181870(strArr: Array<String>): Array<String> {
    return strArr.filter { !it.contains("ad") }.toTypedArray()
}