// https://leetcode.com/problems/container-with-most-water/


class Solution {
    public int maxArea(int[] height) {
        int ans=0;

        int s=0;
        int e=height.length-1;

        while(s<e){
            int min=Math.min(height[s],height[e]);
            ans=Math.max(ans,min*(e-s));
            if(height[s]>height[e]){
                e--;
            }else{
                s++;
            }
       
        }

        return ans;
    }
}