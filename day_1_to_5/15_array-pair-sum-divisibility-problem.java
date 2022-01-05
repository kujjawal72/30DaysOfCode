//problem link: https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1#

class Solution {
    public boolean canPair(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            int rem = num%k;
            if(!map.containsKey(rem)){
                map.put(rem,1);
            }else{
                map.put(rem,map.get(rem)+1);
            }
        }
        for(int num:nums){
            int rem = num%k;
            int freq = map.get(rem);
            if(rem == 0){
                if(freq%2 != 0){
                    return false;
                }
            }else if(2*rem == k){
                if(freq%2 != 0){
                    return false;
                }
            }else{
                if(freq != map.getOrDefault(k-rem,0)){
                    return false;
                }
            }
            
        }
        return true;
    }
}
