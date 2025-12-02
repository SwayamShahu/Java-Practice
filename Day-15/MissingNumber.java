public class MissingNumber {
    public static int findMissing(int[] nums) {
        int xor = 0, n = nums.length;

        // XOR all array elements
        for (int num : nums)
            xor ^= num;

        // XOR with all numbers from 0 to n
        for (int i = 0; i <= n; i++)
            xor ^= i;

        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 4};
        System.out.println("Missing Number: " + findMissing(nums));
    }
}
