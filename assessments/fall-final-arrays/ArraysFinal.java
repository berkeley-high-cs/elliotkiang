public class ArraysFinal {

  public int[] triple(int one, int two, int three) {
    int[] i = { one, two, three };
    return i;
  }

  public String lastElement(String[] array) {
    return array[array.length - 1];
  }

  public boolean elementsTheSame(int[] nums, int numOne, int numTwo) {
    return nums[numOne] == nums[numTwo];
  }

  public String fromEnd(String[] words, int pos) {
    return words[words.length - (pos + 1)];
  }

  public String[] swap(String[] words, int posOne, int posTwo) {
    String temp = words[posOne];
    words[posOne] = words[posTwo];
    words[posTwo] = temp;
    return words;
  }

  public int[] lastThree(int[] nums) {
    int[] newNums = {
      nums[nums.length - 3],
      nums[nums.length - 2],
      nums[nums.length - 1],
    };
    return newNums;
  }

  public boolean isPalindrome(int[] nums) {
    int[] backwards = new int[nums.length];
    int pos = 0;
    for (int i = nums.length - 1; i <= 0; i--) {
      backwards[pos] = nums[i];
      pos++;
    }
    return backwards == nums;
  }

  public int[] squares(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      nums[i] = nums[i] * nums[i];
    }
    return nums;
  }
  public int[] copy(int[]copied){
    int[] copy = new int[copied.length];
    for (int i = 0; i < copied.length; i++) {
      copy[i]=copied[i];
    }
    return copy;
  }
  // Your code goes here

}
