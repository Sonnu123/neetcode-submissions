class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                if(left>=right){
                    break;
                }
                if(left == i){
                    left++;
                }
                if(right == i){
                    right--;
                }
                if(nums[i]+nums[left]+nums[right] == 0){
                    list.add(new ArrayList<>(List.of(nums[i],nums[left],nums[right])));
                    left++;
                    right--;
                }
                else if(nums[i]+nums[left]+nums[right] < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(new LinkedHashSet<>(list));
        return ans;
    }
}
