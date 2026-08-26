class TimeMap {
    Map<String, TreeMap<Integer,String>> bub = new HashMap<>();
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(!bub.containsKey(key)){
            bub.put(key, new TreeMap<>());
        }
        bub.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        if(bub.get(key)==null){
            return "";
        }
        if(bub.get(key).floorKey(timestamp) == null){
            return "";
        }
        else{
            int time = bub.get(key).floorKey(timestamp);
            return bub.get(key).get(time);
        }
    }
}
