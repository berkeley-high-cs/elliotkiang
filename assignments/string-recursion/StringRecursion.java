public class StringRecursion {
  public int length(String word){
    if(word.substring(1).isEmpty()){
      return 0;
    }
      return 1 + length(word.substring(1));
  }
}
