class Solution {
    fun solution(arr: IntArray): IntArray {
        val stk = mutableListOf<Int>()
        var i = 0
        
        while (i < arr.size) {
            when {
                stk.isEmpty() -> {
                    stk.add(arr[i])
                    i++
                }
                stk.last() < arr[i] -> {
                    stk.add(arr[i])
                    i++
                }
                stk.last() >= arr[i] -> {
                    stk.removeAt(stk.size - 1)
                }
            }
        }
        
        return stk.toIntArray()
    }
}