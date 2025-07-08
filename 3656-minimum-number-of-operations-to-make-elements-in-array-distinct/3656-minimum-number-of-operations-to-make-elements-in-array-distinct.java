class Solution {
    public int minimumOperations(int[] nums) {
       int operations = 0;
        int index = 0;

        while (index < nums.length) {
            HashSet<Integer> seen = new HashSet<>();
            boolean hasDuplicates = false;

            for (int i = index; i < nums.length; i++) {
                if (!seen.add(nums[i])) {
                    hasDuplicates = true;
                }
            }

            if (hasDuplicates) {
                operations++;
                index += 3;
            } else {
                break;
            }
        }

        return operations;
    
    }
}