//problem link = https://leetcode.com/problems/greatest-common-divisor-of-strings

class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        if(str1 == str2){
            return str1;
        }
        if(str1.length == str2.length){
            //we have already compared strings, now if length are same & contents aren't then return "" 
            return ""
        }
        return if(str1.length < str2.length){
            val temp = str2.substring(0..(str1.length)-1)
            //println(temp)
            if(temp == str1){
                gcdOfStrings(str2.substring(str1.length),str1)
            }else{
                ""
            }
        }else{
            val temp = str1.substring(0..(str2.length)-1)
            //println(temp)
            if(temp == str2){
                gcdOfStrings(str1.substring(str2.length),str2)
            }else{
                ""
            }
        }
        
    }
}
