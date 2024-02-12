import java.util.ArrayList;

public class Counting {

  // You'll need to use this method
  public boolean isVowel(String c) {
    return "aeiou".indexOf(c) != -1;
  }
  public int countLetter(String word, String letter){
    int count = 0;
    for(int i = 0; i < word.length(); i++){
      if(word.substring(i,i+1).equals(letter)){
        count++;
      }
    }
    return count;
  }
    public int countNumber(int[] nums, int num){
    int count = 0;
    for(int i = 0; i < nums.length; i++){
      if(nums[i] == num){
        count++;
      }
    }
    return count;
  }
   public int countString(ArrayList<String> words, String word){
    int count = 0;
    for(int i = 0; i < words.size(); i++){
      if(words.get(i).equals(word)){
        count++;
      }
    }
    return count;
  }
  public int countVowel(String word){
    int count = 0;
    for(int i = 0; i < word.length(); i++){
      if(isVowel(word.substring(i,i+1))){
        count++;
      }
    }
    return count;
  }
}
