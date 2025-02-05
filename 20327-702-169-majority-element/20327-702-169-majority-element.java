class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int check = (int) Math.floor(n/2);
        int ans = 0;
        for (int i=0;i<n;i++) {
            int freq = 1;
            for (int j=i+1;j<n;j++) {
                if (nums[i]==nums[j]) freq++;
            }
            if (freq > check) {
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}