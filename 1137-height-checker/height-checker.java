import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int l = heights.length;
        int count = 0;

        int[] expected = Arrays.copyOf(heights, l);


        Arrays.sort(expected);

        for (int i = 0; i < l; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
}
