class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        val answer = arr.copyOf()
        
        for (query in queries) {
            val s = query[0]  
            val e = query[1]  
            val k = query[2]  
            
            if (k == 0) {
                if (s <= 0 && 0 <= e) {
                    answer[0] += 1
                }
            } else {
                for (i in s..e) {
                    if (i % k == 0) {
                        answer[i] += 1
                    }
                }
            }
        }
        
        return answer
    }
}