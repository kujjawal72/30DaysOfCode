//problem link : https://practice.geeksforgeeks.org/problems/number-following-a-pattern3126/1

class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        String s = "";
        Stack<Integer> stack = new Stack<>();
        int counter = 1;
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(c == 'D'){
                stack.push(counter++);
            }else{//i
                stack.push(counter++);
                while(!stack.isEmpty()){
                    s += ""+stack.pop();
                }
            }
        }
        stack.push(counter);
        while(!stack.isEmpty()){
                    s += ""+stack.pop();
                }
        return s;
    }
}
