package lv_0

// case: todo_list = ["problemsolving", "practiceguitar", "swim", "studygraph"], finished = [true, false, false, true]
fun no181885(todo_list: Array<String>, finished: BooleanArray): Array<String> {
    var answer: Array<String> = arrayOf()

    for(i in todo_list.indices) {
        if(!finished[i]) {
            answer += todo_list[i]
        }
    }

    return answer
}