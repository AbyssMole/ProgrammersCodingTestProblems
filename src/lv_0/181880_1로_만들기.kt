package lv_0

// case) num_list = [12, 4, 15, 1, 14]
fun no181880(num_list: IntArray): Int {
    var answer = 0

    for(num in num_list) {
        var n = num

        while (n != 1) {
            if(n % 2 == 0) {
                n = n / 2
            } else {
                n = (n - 1) / 2
            }

            answer++
        }
    }

    return answer
}