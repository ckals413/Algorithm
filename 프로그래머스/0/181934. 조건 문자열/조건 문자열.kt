class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        if(eq == "="){
            if(ineq == ">"){
                if(n>=m){
                    return 1
                }else return 0
            }else if(ineq == "<"){
                if(ineq =="<"){
                    if(n<=m){
                        return 1
                    }
                        else return 0
                }
            }
        }else{
             if(ineq == ">"){
                if(n>m){
                    return 1
                }else return 0
            }else if(ineq == "<"){
                if(ineq =="<"){
                    if(n<m){
                        return 1
                    }
                        else return 0
                }
            }
        } 
        return -1
    }
}