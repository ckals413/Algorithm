class Solution {
    fun solution(myString: String, pat: String): Int {
        var count = 0
        var start = 0

        while (true) {
            val pos = myString.indexOf(pat, start) 
            if (pos == -1) break
            count++
            start = pos + 1          
        }
        return count
    }
}
