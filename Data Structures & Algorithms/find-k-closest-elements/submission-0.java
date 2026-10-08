class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int loc = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(x > arr[i]){
                loc++;
            }
        }
        int left = loc-1;
        int right = loc;

        while(list.size() < k){
            if(left < 0){
                list.add(arr[right]);
                right++;
            }
            else if(right >= arr.length){
                list.add(arr[left]);
                left--;
            }
            else if(Math.abs(arr[right] - x) < Math.abs(arr[left] - x)){
                list.add(arr[right]);
                right++;
            }
            else{
                list.add(arr[left]);
                left--;
            }
        }
        Collections.sort(list);
        return list;
    }
}