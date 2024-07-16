//  Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        
        int j=0;
       for(int x: nums){
        if(j==0 || x>nums[j-1]){
            nums[j++]=x;
        }
       }
        return j;
    }
}