class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        
        var mul: Int = 1
        var plus: Int = 0
        
        for(i in num_list.indices){
            plus += num_list[i]
            mul *= num_list[i]
        }
        if(mul < plus*plus){
            answer = 1
        }
        
        return answer
    }
}