class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            // set.add() returns false if the element is already in the set
            if (!seen.add(num)) {
                return true; 
            }
        }
        return false;
    
    }
}