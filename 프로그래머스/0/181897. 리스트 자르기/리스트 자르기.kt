class Solution {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        val (a, b, c) = slicer
        return when (n) {
            1 -> num_list.sliceArray(0..b)
            2 -> num_list.sliceArray(a until num_list.size)
            3 -> num_list.sliceArray(a..b)
            4 -> (a..b step c).map { num_list[it] }.toIntArray()
            else -> intArrayOf()
        }
    }
}
