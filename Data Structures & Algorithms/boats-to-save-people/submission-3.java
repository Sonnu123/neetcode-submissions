class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length-1;
        int ans = 0;
        while(left<=right){
            if(left == right){
                ans++;
                break;
            }
            if(people[right] + people[left] <= limit){
                ans++;
                right--;
                left++;
            }
            else{
                if(people[right] <= limit){
                    ans++;
                }
                right--;
            }
            
        }
        return ans;
    }
}