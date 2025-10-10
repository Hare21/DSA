class Solution {
    public int myAtoi(String s) {
        // Step 1: Trim leading/trailing spaces
        s = s.trim();
        if (s.isEmpty()) return 0;

        int i = 0, sign = 1;
        long result = 0; // use long to detect overflow

        // Step 2: Handle sign
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Process digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;

            // Step 4: Check for overflow
            if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

    
        return (int) (result * sign);
    }
}
