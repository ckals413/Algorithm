class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        var k: Int = a
        
         for(i in included.indices){
            if(included[i]){
                answer += k
            }
            k+=d
         }
        return answer
    }
}