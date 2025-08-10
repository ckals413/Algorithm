class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var result = my_string.toCharArray()
        
        for (query in queries) {
            val start = query[0]
            val end = query[1]
            
            var left = start
            var right = end
            
            while (left < right) {
                val temp = result[left]
                result[left] = result[right]
                result[right] = temp
                
                left++
                right--
            }
        }
        
        return String(result)
    }
}