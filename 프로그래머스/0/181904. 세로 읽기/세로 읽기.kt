class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        val sb = StringBuilder()
        for (i in my_string.indices step m) {
            sb.append(my_string[i + c - 1])
        }
        return sb.toString()
    }
}
