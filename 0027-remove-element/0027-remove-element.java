class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        int rear = nums.length-1;

        for(int i=0;i<=rear;i++)
        {
            if(nums[i]==val)
            {
                k--;
                for(int j=i;j<rear;j++)
                {
                    nums[j]=nums[j+1];
                }
                rear--;
                i--;
            }
        }
        return k;

    }
}