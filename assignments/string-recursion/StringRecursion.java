public class StringRecursion {
  public int length(String word){
    if(word.isEmpty()){
      return 0;
    }
      return 1 + length(word.substring(1));
  }
  public int countXs(String word){
    if(word.isEmpty()){
      return 0;
    } else {
      if(word.substring(0,1).equals("x")){
        return countXs(word.substring(1)) + 1;
      }
    }
      
  }
}
