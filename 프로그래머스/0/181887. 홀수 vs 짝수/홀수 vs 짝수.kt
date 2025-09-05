class Solution {
    fun solution(num_list: IntArray): Int {
        val even = num_list.filterIndexed{index, _ -> index%2 == 0}.sum()
        val odd = num_list.filterIndexed{index, _ -> index%2 != 0}.sum()
        if(even>odd){
            return even
        }else return odd
        
    }
}