class Solution {
    fun solution(myString: String, pat: String): String {
        val last = myString.lastIndexOf(pat)  
        return myString.substring(0, last + pat.length)
    }
}
