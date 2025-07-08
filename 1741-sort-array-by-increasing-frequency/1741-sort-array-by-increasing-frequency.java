

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer[] numsArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        
        Arrays.sort(numsArr, (a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA == freqB) {
                return Integer.compare(b, a);
            }
            return Integer.compare(freqA, freqB); 
        });

        return Arrays.stream(numsArr).mapToInt(Integer::intValue).toArray();
    }
}
