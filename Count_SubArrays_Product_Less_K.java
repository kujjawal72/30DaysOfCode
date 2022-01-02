//problem link: https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/#

class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int count = 0;
        long product = 1;
        int start = 0;
        int end = 0;
        while(end<n){
            product *= a[end];
            while(start<=end && product>= k){
                product /= a[start];
                start++;
            }
            count = count + (end-start + 1);
            end++;
        }
        return count;
    }
}
