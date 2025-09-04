class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var back = num_list.sliceArray(n until num_list.size)
        var front = num_list.sliceArray(0 until n)
        return back + front
          
    }
}