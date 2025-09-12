class Solution {
    fun solution(my_string: String, alp: String): String {
        val c: Char = alp[0]                 
        return my_string.replace(c, c.uppercaseChar())
    }
}
