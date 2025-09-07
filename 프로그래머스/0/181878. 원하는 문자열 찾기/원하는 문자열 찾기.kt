class Solution {
    fun solution(myString: String, pat: String): Int {
        if (pat.length > myString.length) return 0
        val found = myString.indexOf(pat, ignoreCase = true) >= 0
        return if (found) 1 else 0
    }
}
