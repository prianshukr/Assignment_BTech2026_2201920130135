class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> productCount = new HashMap<>();
        int n = nums.length;
        int result = 0;

        // Iterate through all unique pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                
                // If this product already exists, count valid tuples
                if (productCount.containsKey(product)) {
                    int freq = productCount.get(product);
                    result += 8 * freq; // Each valid pair contributes 8 permutations
                }

                // Store/update the product frequency
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }

        return result;
    }
}
