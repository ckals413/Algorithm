class Solution {
    fun solution(arr: IntArray): IntArray {
     // 50 이상 짝수 -> /2
     // 50 미만 홀수 -> *2
    return arr.map{ num -> 
        when{
            num >= 50 && num%2 == 0 -> num/2
            num < 50 && num%2 != 0 -> num*2
            else-> num
        }
    }.toIntArray()
}
}