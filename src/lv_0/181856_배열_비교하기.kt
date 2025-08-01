package lv_0

/*
* 이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다.

* 두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
* 배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 같다면 같습니다.
*
* 두 정수 배열 arr1과 arr2가 주어질 때, 위에서 정의한 배열의 대소관계에 대하여
* arr2가 크다면 -1, arr1이 크다면 1, 두 배열이 같다면 0을 return 하는 solution 함수를 작성해 주세요.
* */

fun main() {
    val arr1 = intArrayOf(100, 17, 84, 1)
    val arr2 = intArrayOf(55, 12, 65, 36)

    if(arr1.size == arr2.size) {
        if(arr1.sum() > arr2.sum()) {
            print(1)
        } else if(arr1.sum() < arr2.sum()) {
            print(-1)
        } else {
            print(0)
        }
    } else if(arr1.size > arr2.size) {
        print(1)
    } else {
        print(-1)
    }
}