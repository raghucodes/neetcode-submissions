class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for(String str : strs) {
            encoded.append(str.length()).append('#').append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<String>();
        int i=0;
        int n = str.length();
        while(i<n) {
            int j=i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i=j+1;
            result.add(str.substring(i,i+length));
            i = i+length;
        }

        return result;
    }
}
