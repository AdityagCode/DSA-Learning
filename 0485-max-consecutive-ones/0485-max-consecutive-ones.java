class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_conseq = 0;
        int conseq = 0;
        //ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(max_conseq<conseq){
                    max_conseq = conseq;
                }
                conseq = 0;
            }
            else{
                conseq++;
            }
        }
        if(max_conseq<conseq){
                    max_conseq = conseq;
                }
        return max_conseq;
    }
}