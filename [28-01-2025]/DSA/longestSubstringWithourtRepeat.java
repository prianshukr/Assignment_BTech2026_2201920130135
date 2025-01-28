class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
    int[] lastIndex = new int[128];
    Arrays.fill(lastIndex, -1);
    int maxLen = 0;
    int start = 0;
    for (int end = 0; end < n; end++) {
        char currChar = s.charAt(end);
        start = Math.max(start, lastIndex[currChar] + 1);
        lastIndex[currChar] = end;
        maxLen = Math.max(maxLen, end - start + 1);
    }
    return maxLen;
    }
}
