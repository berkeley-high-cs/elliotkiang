public class BinarySearch {
  public int search(int[] nums, int target){
    int low = 0;
    int high = nums.length;
    int mid = (high - low) / 2;
    int midValue = nums[mid];
    while (low < high){
      if (target < midValue) {
        high = mid;
        mid = (high - low) / 2;
        midValue = nums[mid];
      } else if (target > midValue) {
        low = mid;
        mid = (high - low) / 2;
        midValue = nums[mid];
      } else {
        return mid;
      }
    }
    return -1;
  }
}