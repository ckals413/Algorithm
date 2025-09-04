class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var L = 0
        var R = arr.lastIndex
        
        for(i in query.indices){
            val q = query[i]
            if(i%2==0){ 
                // 짝수 -> 뒤자른다
                R = L + q
            }else{
                // 홀수 -> 앞 자른다
                L = L + q
            }
        }
        return arr.copyOfRange(L,R+1)
    }
}