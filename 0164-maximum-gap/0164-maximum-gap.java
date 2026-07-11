import java.util.Arrays;
class Solution {
    public int maximumGap(int[] a) {
        if(a.length<2) return 0;
        Arrays.sort(a);
        int maxGap = 0;
        for(int i=0;i<a.length-1;i++){
            int temp = a[i+1]-a[i];
            if(temp>maxGap) maxGap = temp;
        }
        return maxGap;
    }
}