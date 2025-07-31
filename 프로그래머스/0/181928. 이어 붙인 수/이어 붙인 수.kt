class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var odd = StringBuilder() 
        var even = StringBuilder()
        
        for(i in num_list.indices){
            if(num_list[i]%2==0){
                even.append(num_list[i])
            }else{
                odd.append(num_list[i])
            }
        }
        answer = odd.toString().toInt() + even.toString().toInt()        
        
        return answer
    }
}