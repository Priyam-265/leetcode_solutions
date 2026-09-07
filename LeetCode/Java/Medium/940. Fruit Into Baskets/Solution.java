class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0;
        for(int r=0;r<n;r++){
            map.put(fruits[r],map.getOrDefault(0,r)+1);
            while(map.size()>2){
                map.remove(fruits[l]);
                map.remove(map.getOrDefault(0,r)-1);
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
        
    }
}