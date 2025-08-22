class Solution {
    fun solution(my_string: String, is_suffix: String): Int {
        val len = my_string.length
        val len2 = is_suffix.length

        if (len2 > len) return 0  // 길이 체크 

        val after_string = my_string.substring(len - len2)
        return if (after_string == is_suffix) 1 else 0
    }
}
