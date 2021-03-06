class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        // this is difficult
        // for loop and get index, all value should be there, 
        // so nums[index] should have value.
        
        for(int i = 0; i<nums.length; i++){
            int index = Math.abs(nums[i]);
            if(nums[index-1]>0){
                nums[index-1] = nums[index-1]*-1;    
            }
            
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0){
                result.add(i+1);
            }
        }
        return result;
    }
}
