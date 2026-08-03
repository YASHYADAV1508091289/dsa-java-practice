
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            if (!isAlphanum(l)) {
                left++;
            }
            else if (!isAlphanum(r)) {
                right--;
            }
            else {
                if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    private boolean isAlphanum(char c) {
        return Character.isLetterOrDigit(c);
    }
}
