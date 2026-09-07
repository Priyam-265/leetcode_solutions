class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int l=0;
        int maxLen=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int r=0;r<n;r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            int max=Collections.max(map.values());
             while((r-l+1)-max>k){
            char left=s.charAt(l);
                map.put(left,map.get(left)-1);
                l++;
             }
            maxLen=Math.max(max,r-l+1);
        }
        return maxLen;
    }
}