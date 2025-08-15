class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        val result = mutableListOf<Int>()
        
        for (str in intStrs) {
            val substring = str.substring(s, s + l)
            val number = substring.toInt()
            
            if (number > k) {
                result.add(number)
            }
        }
        
        return result.toIntArray()
    }
}