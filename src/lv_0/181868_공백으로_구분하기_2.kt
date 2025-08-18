package lv_0

// case) my_string = "i    love  you"
// case2) my_string = "    programmers  "
fun no181868(my_string: String): Array<String> {
    return my_string.split("\\s+".toRegex()).filter { it.isNotEmpty() }.toTypedArray()
}