//problem link: https://practice.geeksforgeeks.org/problems/decode-the-string2444/1#

class Solution{
    static int startPos = 0;
    static String decodedString(String s){
        StringBuilder res = new StringBuilder();
        while(startPos < s.length() && s.charAt(startPos) != ']'){
            if(Character.isDigit(s.charAt(startPos))){
                int k = 0;
                while(startPos < s.length() && Character.isDigit(s.charAt(startPos))){
                    k = k*10 + s.charAt(startPos) - '0';
                    startPos++;
                }
                startPos++;
                String r = decodedString(s);
                while(k>0){
                    res.append(r);
                    k--;
                }
                startPos++;
            }else{
                res.append(s.charAt(startPos));
                startPos++;
            }
        }
        return res.toString();
    }
    
}
