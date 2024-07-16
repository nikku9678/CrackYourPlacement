// 283. https://leetcode.com/problems/move-zeroes/description/

class Solution {
    public void moveZeroes(int[] nums) {
        int cnt=0;
        int k=0;
        for(int x:nums){
            if(x!=0){
                nums[k++]=x;
            }else{
                cnt++;
            }
        }

        while(cnt-->0){
            nums[k++]=0;
        }
    }
}