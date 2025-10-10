class Solution {
    public boolean isPalindrome(int x) {

        int original  = x;
        int reversedNum = 0;
       if (x < 0) return false;
        while (x > 0){
         int lastDigit =   x % 10;
            reversedNum = (reversedNum * 10) + lastDigit;
            x = x /10;

        }
       if (reversedNum == original) {
        return true;
       }
       return false;
    }
}