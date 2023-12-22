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
    return words[words.length-(pos+1)];
  }
  public String[] swap(String[] words, int posOne, int posTwo){
    String temp = words[posOne];
    words[posOne]=words[posTwo];
    words[posTwo]=temp;
    return words;

  }
  // Your code goes here

}
