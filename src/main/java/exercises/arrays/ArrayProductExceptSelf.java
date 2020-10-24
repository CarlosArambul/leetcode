package exercises.arrays;

/**
 * Given an array nums of n integers where n > 1, return an array output such that output[i] is
 * equal to the product of all the elements of nums except nums[i].
 *
 * <p>Example:
 *
 * <p>Input: [1,2,3,4] Output: [24,12,8,6] Constraint: It's guaranteed that the product of the
 * elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit
 * integer.
 *
 * <p>Note: Please solve it without division and in O(n).
 *
 * <p>Follow up: Could you solve it with constant space complexity? (The output array does not count
 * as extra space for the purpose of space complexity analysis.)
 */
public class ArrayProductExceptSelf {

  public int[] getProduct(int[] nums) {

    if (nums == null || nums.length < 2) {
      throw new IllegalArgumentException("There must be at least 2 numbers in the array");
    }

    int length = nums.length;
    int[] result = new int[length];

    for (int i = 0; i < length; i++) {
      int product = 1;

      for (int j = 0; j < length; j++) {

          if (j != i) {
              product *= nums[j];
          }
      }
      result[i] = product;
    }
    return result;
  }

}
