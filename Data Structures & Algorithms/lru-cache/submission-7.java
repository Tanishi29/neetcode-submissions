class LRUCache {

    LinkedHashMap<Integer, Integer> map;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>(capacity, 0.75f, true);
        
    }
    
    public int get(int key) {

        if(map.containsKey(key)){
            return map.get(key);
        }

        return -1;
        
    }
    
    public void put(int key, int value) {

        if(map.containsKey(key)){
            map.put(key, value);
        }
        else if(map.size() < capacity){
            map.put(key, value);
        }
        else{
            int lru = map.keySet().iterator().next();
            map.remove(lru);
            map.put(key, value);
        }
    }
}
