package lv_1

fun main() {
    val wallpaper = arrayOf(
        "..........",
        ".....#....",
        "......##..",
        "...##.....",
        "....#....."
    )

    var answer = intArrayOf()

    wallpaper.forEachIndexed { index, line ->
        // 줄마다 파일이 존재하는지 체크
        if(line.contains("#")) {
            // 처음 파일을 찾은 경우
            if(answer.isEmpty()) {
                answer += index
                answer += line.indexOf("#")
                answer += index + 1
                answer += line.lastIndexOf("#") + 1
            } else {
                // 기존 파일 위치와 새로운 파일 위치 체크
                if(answer[1] > line.indexOf("#")) {
                    answer[1] = line.indexOf("#")
                }

                if(answer[2] < index + 1) {
                    answer[2] = index + 1
                }

                if(answer[3] < line.lastIndexOf("#") + 1) {
                    answer[3] = line.lastIndexOf("#") + 1
                }
            }
        }
    }

    print(answer.toList())
}