// https://leetcode.com/problems/sort-colors/

class Solution {
    public void swap(int[] nums,int m,int n){
        int temp=nums[m];
        nums[m]=nums[n];
        nums[n]=temp;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int s=0,e=n-1,m=0;

        while(m<=e){
            
            if(nums[m]==0){
                swap(nums,m,s);
                s++;
                m++;
            }else if(nums[m]==1){
                m++;
            }else{
                swap(nums,m,e);
                e--;
            }
        }
    }
}