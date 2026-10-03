class Solution {
    public boolean isPalindrome(String s) {
        int j = s.length() - 1;
        int i = 0;

        while (j > i) {
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }

            if (Character.toLowerCase(s.charAt(j)) == Character.toLowerCase(s.charAt(i))) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
