class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var result = mutableListOf<Int>()
        for(i in num_list.indices step n){
            result.add(num_list[i])
        }
        return result.toIntArray()
    }
}