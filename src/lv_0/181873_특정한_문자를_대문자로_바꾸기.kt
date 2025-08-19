package lv_0

// case) my_string = "programmers", alp = "p"
fun no181873(my_string: String, alp: String): String {
    return my_string.replace(alp, alp.uppercase())
}