public class Crossword {
  public boolean fits(String s1, String s2){
    if(s2.indexOf("-")==-1){
      return s1==s2;
    }
  }
}
