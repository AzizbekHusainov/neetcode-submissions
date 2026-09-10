class Solution {
    public boolean isPalindrome(String s) {
        int j = 0, i = s.length() - 1;

        while (j < i) {
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(j)) == Character.toLowerCase(s.charAt(i))) {
                j++;
                i--;
            } else {
                return false;
            }
        }
        return true;
    }
}
