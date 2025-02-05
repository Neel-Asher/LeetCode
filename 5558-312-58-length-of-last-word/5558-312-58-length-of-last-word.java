class Solution {
    public int lengthOfLastWord(String s) {
        String str[] = s.split(" ");
        int n = str[str.length-1].length();
        return n;
    }
}