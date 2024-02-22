public class BinarySearch {
  public int search(int[] nums, int target){
    int low = 0;
    int high = nums.length;
    int mid = (high - low) / 2;
    int midVaule = nums[mid];
    while (low < high){
      if (target < midVaule) {
        high = mid;
        mid = (high - low) / 2;
        midVaule = nums[mid];
      } else if (target > midVaule) {
        low = mid;
        mid = (high - low) / 2;
        midVaule = nums[mid];
      } else {
        return mid;
      }
    }
    return -1;
  }
}
