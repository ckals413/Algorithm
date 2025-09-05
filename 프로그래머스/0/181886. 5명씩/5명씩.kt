class Solution {
    fun solution(names: Array<String>): Array<String> {
       return names.filterIndexed{i,v -> i%5==0}.toTypedArray()
    }
}