package lv_1

fun no172928(park: Array<String> = arrayOf("SOO","OXX","OOO"), routes:  Array<String> = arrayOf("E 2","S 2","W 1")): IntArray {
    val width = park[0].length
    val height = park.size
    var current = intArrayOf(0,0) // 현재 위치

    // 시작 좌표 초기화
    park.forEach {
        if(it.contains("S")) {
            current[0] = park.indexOf(it)
            current[1] = it.indexOf("S")
        }
    }

    // 위치 이동
    for(route in routes) {
        var command = route.split(" ")
        var direction = command[0]
        var distance = command[1].toInt()
        var noX = true

        when(direction) {
            "E" -> {
                if(current[1] + distance >= width) {
                    continue
                }

                for(i in 1..distance) {
                    if(park[current[0]][current[1] + i] == 'X')
                        noX = false
                }

                if(noX) {
                    current[1] += distance
                }
            }
            "W" -> {
                if(current[1] - distance < 0) {
                    continue
                }

                for(i in 1..distance) {
                    if(park[current[0]][current[1] - i] == 'X')
                        noX = false
                }

                if(noX) {
                    current[1] -= distance
                }
            }
            "S" -> {
                if(current[0] + distance >= height) {
                    continue
                }

                for(i in 1..distance) {
                    if(park[current[0] + i][current[1]] == 'X')
                        noX = false
                }

                if(noX) {
                    current[0] += distance
                }
            }
            "N" -> {
                if(current[0] - distance < 0) {
                    continue
                }

                for(i in 1..distance) {
                    if(park[current[0] - i][current[1]] == 'X')
                        noX = false
                }

                if(noX) {
                    current[0] -= distance
                }
            }
        }
    }

    return current
}