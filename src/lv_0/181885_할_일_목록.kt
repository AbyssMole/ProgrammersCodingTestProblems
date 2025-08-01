package lv_0

/*
* 오늘 해야 할 일이 담긴 문자열 배열 todo_list와 각각의 일을 지금 마쳤는지를 나타내는 boolean 배열 finished가 매개변수로 주어질 때,
* todo_list에서 아직 마치지 못한 일들을 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
* */
fun main() {
    val todo_list: Array<String> = arrayOf("problemsolving", "practiceguitar", "swim", "studygraph")
    val finished: Array<Boolean> = arrayOf(true, false, false, true)
    var answer: Array<String> = arrayOf()

    for(i in todo_list.indices) {
        if(!finished[i]) {
            answer += todo_list[i]
        }
    }

    print(answer.toList())
}