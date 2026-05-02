class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String str : strs) {
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            String sorted = String.valueOf(cs);
            if(hm.containsKey(sorted)) {
                List<String> ls = hm.get(sorted);
                ls.add(str);
                hm.put(sorted, ls);
            } else {
                ArrayList<String> ls = new ArrayList<>();
                ls.add(str);
                hm.put(sorted, ls);
            }
        }

        List<List<String>> result = new ArrayList<List<String>>();

        for(String key : hm.keySet()) {
            result.add(hm.get(key));
        }

        return result;
    }
}
