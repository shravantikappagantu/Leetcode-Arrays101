class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;  
        int result = 0;  
      
        for (int i = 0; i <nums.length; i++) 
        { 
             
            if (nums[i] == 0) // if 0 is found
                count = 0; 
       
            else
            { 
                count++; 
                result = Math.max(result, count); 
            } 
        } 
      
        return result;
        
    }
}