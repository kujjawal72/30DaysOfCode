//problem link: https://leetcode.com/problems/minimum-size-subarray-sum/submissions/

class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var i = 0;
        var minCount = 0;
        while(i<nums.size){
            
            var j = i;
            var sum = 0;
            var count = 0;
            while(j<nums.size){
                sum += nums[j];
                count++;
                if(sum>=target){
                    if(minCount == 0){
                        minCount = count;
                    }else if(minCount>count){
                        minCount = count;
                    }
                    break
                }else{
                    if(minCount != 0 && minCount<count){
                        break;
                    }
                }
                j++
            }
            i++
        }
        return minCount;
    }
}
