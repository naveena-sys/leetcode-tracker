// Last updated: 7/11/2026, 2:04:43 PM
class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==0)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[j]!=0)
                    {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    break;
                    }
                }
            }
        }
        
    }
}