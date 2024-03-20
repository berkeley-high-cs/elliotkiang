public class StringRecursion {
  public int length(String word){
    String word2 = word;
    if(word2.isEmpty()){
      return 0;
    }
      count++;
      return 1 + length(word2.substring(count));
  }
}
