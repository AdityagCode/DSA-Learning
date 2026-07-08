class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        // The formula for the sum of the first n natural numbers is n * (n + 1) / 2
        int expectedSum = n * (n + 1) / 2;
        
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum += arr[i]; // Corrected addition assignment operator
        }
        
        return expectedSum - actualSum;
    }
}