class Solution {
    public void moveZeroes(int[] nums) {
        int writePointer = 0;

        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != 0) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }

        for (int i = writePointer; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
