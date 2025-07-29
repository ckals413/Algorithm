class Solution {
    fun solution(code: String): String {
        val ret = StringBuilder()
        var mode = 0
        
        for(i in code.indices){
           if(code[i]=='1'){
               mode = 1-mode
           }else{
               if(i%2==0 && mode == 0  || i%2!=0 && mode == 1 ){
                   ret.append(code[i])
               }
           }
        }
        return if(ret.isEmpty()) "EMPTY" else ret.toString()
    }
}