class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = 0;
        
        Arrays.sort(nums);
        
        if (nums.length <= 3) {
            for (int num:nums) 
                closestSum += num; 
            return closestSum; 
        }
        
        closestSum = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];
        
        for(int i = 0; i < nums.length - 2; i++) {
            
            int startPointer = i + 1;
            int endPointer = nums.length - 1;
            
            while(startPointer < endPointer) {
                int calcSum = nums[i] + nums[startPointer] + nums[endPointer];
                
                if(calcSum < target) {
                    startPointer++;
                }
                
                else {
                    endPointer--;
                }
                if(Math.abs(calcSum - target) < Math.abs(closestSum - target)) {
                    closestSum = calcSum ;
                }
            }
        }
        return closestSum;
    }
}
