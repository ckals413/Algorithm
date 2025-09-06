class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
       // 2차원 배열에서 어떻게 빼낼까? 
        for(i in queries){
            var s = i[0]
            var e = i[1]
            
            for(j in s..e){
                arr[j] = arr[j] + 1
            }
        }
        
        return arr
        
        
    }
}