class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
        return "";
    }
    int n = s.length();
    boolean[][] x = new boolean[n][n];
    int maxLength = 1;
    int start = 0;
    for (int i = 0; i < n; i++) {
        x[i][i] = true;
    }
    for (int i = 0; i < n - 1; i++) {
        if (s.charAt(i) == s.charAt(i + 1)) {
            x[i][i + 1] = true;
            start = i;
            maxLength = 2;
        }
    }
    for (int len = 3; len <= n; len++) {
        for (int i = 0; i <= n - len; i++) {
            int j = i + len - 1;
            if (s.charAt(i) == s.charAt(j) && x[i + 1][j - 1]) {
                x[i][j] = true;
                if (len > maxLength) {
                    start = i;
                    maxLength = len;
                }
            }
        }
    }
    return s.substring(start, start + maxLength);
}
}
