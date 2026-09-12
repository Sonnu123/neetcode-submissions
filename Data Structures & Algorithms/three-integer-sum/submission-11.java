class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<String> bub = new HashSet<>();
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int b = 0;
        int c = nums.length-1;
        for(int a = 0; a<nums.length-2; a++){
            int z = 1;
            b = a+1;
            c = nums.length-1;
            while(b<c){
                if(nums[a] + nums[b] + nums[c] == 0){
                    String coo = "" + nums[a] + nums[b] + nums[c];
                    if(!bub.contains(coo)){
                        ans.add(new ArrayList<>(List.of(nums[a],nums[b],nums[c])));
                        bub.add(coo);
                    }
                }
                if(nums[a] + nums[b] + nums[c] > 0){
                    c--;
                }
                else{
                    b++;
                }
            }
        }
        return ans;
    }
}
