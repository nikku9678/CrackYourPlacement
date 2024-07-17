// https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        long ans=Integer.MAX_VALUE;
        Collections.sort(a);
        int i=0;
        int j=m-1;
        while(j<n){
            ans=Math.min(a.get(j)-a.get(i),ans);
            i++;
            j++;
        }
        
        return ans;
    }
}