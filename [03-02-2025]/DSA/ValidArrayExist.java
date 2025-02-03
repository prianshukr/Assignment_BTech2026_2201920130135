class Solution {
    public boolean doesValidArrayExist(int[] d) {
        int xorSum = 0;
        for (int num : d) {
            xorSum ^= num;
        }
        return xorSum == 0;
    }
}
