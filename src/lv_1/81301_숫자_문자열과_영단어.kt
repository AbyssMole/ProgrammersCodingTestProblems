package lv_1

// case1 : s = "one4seveneight", result = 1478
// case2 : s = "23four5six7", result = 234567
// case3 : s = "2three45sixseven", result = 234567
fun no81301(s: String = "23four5six7"): Int {
    return s.replace("zero", "0")
        .replace("one", "1")
        .replace("two", "2")
        .replace("three", "3")
        .replace("four", "4")
        .replace("five", "5")
        .replace("six", "6")
        .replace("seven", "7")
        .replace("eight", "8")
        .replace("nine", "9")
        .toInt()
}