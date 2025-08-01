class Solution {
    fun solution(numLog: IntArray): String {
        var result = StringBuilder()
        
        for(i in numLog.indices){
            if(i<numLog.size-1){
                var num = numLog[i+1] - numLog[i]
                when(num){
                    1 -> result.append('w')
                    -1 -> result.append('s')
                    10 -> result.append('d')
                    -10 -> result.append('a')
                }
            }
        }
        
        return result.toString()
    }
}