class Solution {
    fun solution(my_string: String): IntArray {
        val counts = IntArray(52) // A~Z + a~z

        for (ch in my_string) {
            if (ch in 'A'..'Z') {
                counts[ch - 'A']++          
            } else if (ch in 'a'..'z') {
                counts[ch - 'a' + 26]++   
            }
        }

        return counts
    }
}
