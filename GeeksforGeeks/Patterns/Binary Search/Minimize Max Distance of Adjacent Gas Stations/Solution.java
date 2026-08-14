class Solution {
    public int count(int[] stations , double mid){
        int count=0;
        for(int i=1;i<stations.length;i++){
            int gap=(int) ((stations[i]-stations[i-1])/mid);
            if((stations[i]-stations[i-1])==(mid*gap)) gap--;
            
                count+=gap;
            
            
        }
        return count;
    }
    public double minMaxDist(int[] stations, int k) {
        // code here
        int n=stations.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int x:stations){
            max=Math.max(max,x);
        }
        double low=0;
        double high=max;
        double diff=1e-6;
        while(high-low>=diff){
            double mid=(low+high)/2.0;
            if(count(stations,mid)>k){
                low=mid;
            }
            else{
                high=mid;
            }
        }
        return low;
        
    }
}
