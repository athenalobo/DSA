//Consider it as like-minded handshakes.

class Solution 
{
    public int numIdenticalPairs(int[] nums) 
    {
        HashMap<Integer, Integer>map=new HashMap<>();
        int check,ans=0;
        for(int i=0;i<nums.length;i++)
        {
            check=map.getOrDefault(nums[i],0);
            ans+=check;
            map.put(nums[i],check+1);
        }
        return ans;
    }
}
