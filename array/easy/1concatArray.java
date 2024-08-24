// https://leetcode.com/problems/concatenation-of-array/
class Solution {
    public int[] getConcatenation(int[] array1) {
        int[] array2;
        int[] ans;
        array2 = array1;

        int arrayOneLength = array1.length;
        int arrayTwoLength = array2.length;

        ans = new int[arrayOneLength + arrayTwoLength];

        System.arraycopy(array1, 0, ans, 0, arrayOneLength);
        System.arraycopy(array2, 0, ans, arrayOneLength, arrayTwoLength);

        return ans;
    }
}

// Space Complexity: O(n)
// Time Complexity: O(n)