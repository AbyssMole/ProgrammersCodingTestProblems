package lv_0

// case) arr1 = [100, 17, 84, 1], arr2 = [55, 12, 65, 36]
fun no181856(arr1: IntArray, arr2: IntArray): Int {
    return if(arr1.size == arr2.size)
        if(arr1.sum() > arr2.sum())
            1
        else if(arr1.sum() < arr2.sum())
            -1
        else
            0

    else if(arr1.size > arr2.size)
        1
    else
        -1
}