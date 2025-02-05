class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i=0;i<n;i++) {
            int sum1=0,sum2=0;
            for (int j=0;j<=i;j++) sum1 += nums[j];
            for (int k=i+1;k<n;k++) sum2 += nums[k];
            if (sum1==0 || sum2==0) break;
            if ((sum1-sum2)%2==0) count++;
        }
        return count;
    }
}