public class StringRecursion {
  public int length(String word){
    int count = 0;
    String word2 = word;
    if(word2.isEmpty()){
      return count;
    }
      count++;
      word2 = word.substring(count);
      return length(word2);
  }
}
