class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0, rem = 0,num = x;
        if(num < 0) return false;
        while(num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        return (rev == x)?true:false;
    }
}