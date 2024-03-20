public class StringRecursion {
  public int length(String word){
    if(word.isEmpty()){
      return 0;
    }
      return 3 + length(word.substring(1));
  }
}
