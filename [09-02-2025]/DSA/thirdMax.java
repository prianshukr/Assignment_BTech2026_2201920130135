class Solution {
    private int[] removeDuplicates(int[] nums) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : nums) {
            uniqueElements.add(num);
        }
        int result[] = new int[uniqueElements.size()];
        int i = 0;
        for (int x : uniqueElements) {
            result[i] = x;
            i++;
        }
        return result;
    }

    public int thirdMax(int[] nums) {
        int[] uniqueNums = removeDuplicates(nums);
        Arrays.sort(uniqueNums);
        int length = uniqueNums.length;
        
        if (length < 3) {
            return uniqueNums[length - 1];
        } else {
            return uniqueNums[length - 3];
        }
    }
}
