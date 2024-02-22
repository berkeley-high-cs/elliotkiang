public class BinarySearch {
  public int search(int[] nums, int target){
    int low = 0;
    int high = nums.length;
    int mid = low + (high - low) / 2;
    int midVal = nums[mid];
    while (low > high){
      if (target < midVal) {
        high = mid;
      } else if (target > midVal) {
        low = mid + 1;
      } else {
        return mid;
      }
    }
  }
}
