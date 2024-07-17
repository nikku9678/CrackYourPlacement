// https://leetcode.com/problems/two-sum/submissions/1323830322/


class Pair implements Comparable<Pair> {  
    int val;  
    int index;  

    Pair(int val, int index) {  
        this.val = val;  
        this.index = index;  
    }  

    @Override  
    public int compareTo(Pair that) {  
        return this.val - that.val;  
    }  
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Pair[] p = new Pair[n];
        for (int i = 0; i < n; i++) {
            p[i] = new Pair(nums[i], i);
        }
        Arrays.sort(p);
        int i = 0, j = n - 1;
        while (i < j) {
            if (p[i].val + p[j].val < target)
                i++;
            else if (p[i].val + p[j].val > target)
                j--;
            else {
                return new int[] { p[i].index, p[j].index };
            }
        }
        return new int[] {};
    }
}