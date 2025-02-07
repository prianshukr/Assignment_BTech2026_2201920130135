public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1); // Initialize with remainder 0 occurring once
        int sum = 0, result = 0;

        for (int num : nums) {
            sum = ((sum + num) % k + k) % k; // Ensure non-negative remainder
            result += countMap.getOrDefault(sum, 0); // Add previous occurrences
            countMap.put(sum, countMap.getOrDefault(sum, 0) + 1); // Update count
        }
        
        return result;
    }
