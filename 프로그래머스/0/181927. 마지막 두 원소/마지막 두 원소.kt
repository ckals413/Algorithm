class Solution {
    fun solution(num_list: IntArray): IntArray {
        val newValue = if (num_list.last() > num_list[num_list.size - 2]) {
            num_list.last() - num_list[num_list.size - 2]
        } else {
            num_list.last() * 2
        }
        return num_list + newValue
    }
}