class Solution {
    public int removeDuplicates(int[] nums) {
        
        // Step 1: start from first element
        int i = 0;
        
        // Step 2: check all elements
        for (int j = 1; j < nums.length; j++) {
            
            // Step 3: if new unique element found
            if (nums[j] != nums[i]) {
                
                i++; // move position forward
                
                nums[i] = nums[j]; // store unique element
            }
        }
        
        // Step 4: return number of unique elements
        return i + 1;
    }
}
