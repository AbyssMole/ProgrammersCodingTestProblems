package lv_0

// case) arr = [0, 1, 1, 1, 0]
fun no181859(arr: IntArray): IntArray {
    var answer: IntArray = intArrayOf()

    for(i in 0..arr.count() - 1) {
        if(answer.isEmpty()) {
            answer += arr[i]
        } else if(answer.last() == arr[i]){
            answer = answer.dropLast(1).toIntArray()
        } else {
            answer += arr[i]
        }
    }

    return if(answer.isEmpty()) intArrayOf(-1) else answer
}