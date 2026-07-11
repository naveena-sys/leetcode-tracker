// Last updated: 7/11/2026, 2:01:52 PM
class Solution {
    public String triangleType(int[] nums) {
        int i = nums[0];
        int j = nums[1];
        int k = nums[2];
        if( i + j <=k || j+ k <= i || k+ i <=j)
        {
            return "none";
        }

        else if(i==j && i==k)
        {
            return "equilateral";
        }
        else if( i==j && i!=k || i==k && i!=j || j==k && j!=i || j!=k && i==k)
        {
            return "isosceles";
        }
        else if( i!=j && i!=k &&j!=k)
        {
            return "scalene";
        }
    return "none";
    }
}