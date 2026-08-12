// Last updated: 8/12/2026, 9:00:27 AM
1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3        if(nums.length==1)
4        {
5            return 1;
6        }
7        Map<Integer,Integer> nm=new HashMap<>();
8        int ans=0,maxi=0;
9        for(int i=0,j=0;i<nums.length;i++)
10        {
11            nm.put(nums[i], nm.getOrDefault(nums[i],0)+1);
12            maxi=Math.max(maxi,nm.get(nums[i]));
13            if(maxi>k)
14            {
15                while(maxi>k)
16                {
17                    if(nm.get(nums[j])==1)
18                    {
19                        nm.remove(nums[j]);
20                        
21                    }
22                    else
23                    {
24                        nm.put(nums[j], nm.getOrDefault(nums[j],0)-1);
25                    }
26                    j++;
27                    maxi=nm.get(nums[i]);
28                }
29            }
30            else
31            {
32                ans=Math.max(ans,i-j+1);
33            }
34        }
35        return ans;
36    }
37}