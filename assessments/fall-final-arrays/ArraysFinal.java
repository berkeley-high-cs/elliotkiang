public class ArraysFinal {
  public int[] triple(int one,int two, int three){
    int[] i = {one,two,three};
    return i;
  }
  public String lastElement(String[] array){
    return array[array.length-1];
  }
  public boolean elementsTheSame(int[] nums, int numOne, int numTwo){
    return nums[numOne]==nums[numTwo];
  }
  public String fromEnd(String[] words, int pos){
    return words[words.length-(pos+1)]
  }
  // Your code goes here

}
