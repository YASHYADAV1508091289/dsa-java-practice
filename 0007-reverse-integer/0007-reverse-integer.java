class Solution {
    public int reverse(int x) {
        int temp = x;
        long rev = 0;
        
        while(temp != 0) {
            int d = temp % 10;
            rev = rev * 10 + d;
            temp = temp / 10;
        }
        
        // Check for overflow/underflow
        if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }
        
        // No need to negate rev again - it's already negative if x was negative
        return (int)rev;
    }
}