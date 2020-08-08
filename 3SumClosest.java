class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = nums[0] + nums[1] + nums[nums.length - 1];
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++) {
            int startPointer = i + 1;
            int endPointer = nums.length - 1;
           
            while(startPointer < endPointer) {
                
                int calcSum =  nums[endPointer] + nums[startPointer] + nums[i];
                
                if(calcSum < target) {
                    startPointer++;
                }    
                 
                else  {
                    endPointer--;
                } 
                                
                if(Math.abs(calcSum - target) < Math.abs(closestSum - target)) {
                        closestSum = calcSum;
                }
 
            }
            
        }
        return closestSum;
    }
}
