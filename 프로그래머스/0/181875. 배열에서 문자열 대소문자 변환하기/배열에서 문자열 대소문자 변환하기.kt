class Solution {
    fun solution(strArr: Array<String>): Array<String> {
       return strArr.mapIndexed { index, s ->
            if (index % 2 == 0) s.lowercase() else s.uppercase()
        }.toTypedArray()
    }
}