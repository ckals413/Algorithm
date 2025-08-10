class Solution {
    fun solution(number: String): Int {
        val sum = number.map { it.digitToInt() }.sum()
        return sum % 9
    }
}