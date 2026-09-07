class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0;
        for(int r=0;r<n;r++){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            while(map.size()>2){
                map.put(fruits[l],map.getOrDefault(fruits[l],0)-1);
                if(map.get(fruits[l])==0) map.remove(fruits[l]);
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
        
    }
}