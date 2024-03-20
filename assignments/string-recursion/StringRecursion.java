public class StringRecursion {
  public int length(String word){
    int count = 0;
    String word2 = word;
    if(word2.isEmpty()){
      return count;
    }
      count++;
      return count += length(word2.substring(count));
  }
}
