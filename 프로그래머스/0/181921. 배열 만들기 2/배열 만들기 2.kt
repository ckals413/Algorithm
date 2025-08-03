class Solution {
    fun solution(l: Int, r: Int): IntArray {
        val result = (l..r).filter { num ->
            num.toString().all { it in "05" }
        }
        
        return if (result.isEmpty()) intArrayOf(-1) else result.toIntArray()
    }
}