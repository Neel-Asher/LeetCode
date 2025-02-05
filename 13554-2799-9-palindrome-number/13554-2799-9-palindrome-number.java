class Solution {
    public boolean isPalindrome(int x) {
        boolean b = false;
        String s = String.valueOf(x);
        String s1 = "";
        for (int i=s.length()-1;i>=0;i--) {
            s1 += s.charAt(i);
        }
        if (s.equals(s1)) b = true;
        return b;
    }
}