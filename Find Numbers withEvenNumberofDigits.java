class Solution {
    public int findNumbers(int[] nums) {
        
        int result=0; // final result
        for(int i=0;i<nums.length;i++)
        {
            int count=0; // count of each number
            while(nums[i] != 0)
            {
                // num = num/10
                nums[i] /= 10;
                ++count;
            }
            
            if (count%2==0)
                result+=1;
        }
        return result;
        
    }
}