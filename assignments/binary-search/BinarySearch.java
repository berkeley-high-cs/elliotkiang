public class BinarySearch {
  public int search(int[] nums, int target){
    int low = 0;
    int high = nums.length;
    int mid = (high - low) / 2;
    int midValue = nums[mid];
    while (low < high){
     mid = (high - low) / 2;
     midValue = nums[mid];
     if (target > midValue) {
        low = mid + 1;
     } else if(midValue == target) {
        return mid;
     } else(target < midValue) {
        high = mid;
     }
    }
    return -1;
  }
}