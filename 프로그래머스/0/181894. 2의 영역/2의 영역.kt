class Solution {
    fun solution(arr: IntArray): IntArray {
        val first = arr.indexOf(2)
        if (first == -1) return intArrayOf(-1)
        val last = arr.lastIndexOf(2)
        return arr.copyOfRange(first, last + 1)
    }
}
