class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val dice = listOf(a, b, c, d)
        val countMap = dice.groupingBy { it }.eachCount()
        val counts = countMap.values.sorted()
        val numbers = countMap.keys.toList()
        
        return when {
            counts == listOf(4) -> {
                val p = numbers[0]
                1111 * p
            }
            
            counts == listOf(1, 3) -> {
                val p = countMap.filterValues { it == 3 }.keys.first()
                val q = countMap.filterValues { it == 1 }.keys.first()
                val score = 10 * p + q
                score * score
            }
            
            counts == listOf(2, 2) -> {
                val pairs = countMap.filterValues { it == 2 }.keys.toList()
                val p = pairs[0]
                val q = pairs[1]
                (p + q) * kotlin.math.abs(p - q)
            }
            
            counts == listOf(1, 1, 2) -> {
                val singles = countMap.filterValues { it == 1 }.keys.toList()
                singles[0] * singles[1]
            }
            
            else -> {
                dice.minOrNull() ?: 0
            }
        }
    }
}