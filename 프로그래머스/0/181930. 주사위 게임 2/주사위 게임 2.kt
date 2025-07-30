class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        var answer: Int = 0
        
        if(a==b && b==c){
            val one = a+b+c
            val two = a*a + b*b + c*c
            val three = a*a*a + b*b*b + c*c*c
            answer = one*two*three
        }else if(a==b||b==c||c==a){
            val one = a+b+c
            val two =  a*a + b*b + c*c
            answer = one*two
        }else{
            answer = a+b+c
        }
        
        return answer
    }
}