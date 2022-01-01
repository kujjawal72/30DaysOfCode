//Problem link: https://practice.geeksforgeeks.org/problems/overlapping-rectangles1924/1/#

class Solution {
    int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        // code here
        int l1x = L1[0];
        int l1y = L1[1];
        int r1x = R1[0];
        int r1y = R1[1];
        
        int l2x = L2[0];
        int l2y = L2[1];
        int r2x = R2[0];
        int r2y = R2[1];
        
        if(r1x<l2x || r2x<l1x){
            return 0;
        }
        if(r1y>l2y || r2y > l1y){
            return 0;
        }
        return 1;
    }
};
