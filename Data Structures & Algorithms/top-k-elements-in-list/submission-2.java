class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int num : nums) {
            if(hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            }
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((a,b) -> Integer.compare(hm.get(a), hm.get(b)));
        int[] result = new int[k];

        for(int key : hm.keySet()) {
            minHeap.offer(key);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int i=0;
        while(!minHeap.isEmpty()) {
            result[i++] = minHeap.poll();
        }

        return result;
    }
}
