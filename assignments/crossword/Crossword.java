public class Crossword {
  public boolean fits(String s1, String s2){
    if(s2.indexOf("-")==-1){
      return s1==s2;
    }
    return s2.substring(0,s2.indexOf("-"))==s1.substring(0,s2.indexOf("-"));
  }
}
