package lv_1


// case1 : price = 3, money = 20, count = 4, result = 10
fun no82612(price: Int = 3, money: Int = 20, count: Int = 4): Long {
    var answer = 0L

    for(i in 1..count) {
        answer += price * i
    }

    return if(answer - money > 0) answer - money else 0
}