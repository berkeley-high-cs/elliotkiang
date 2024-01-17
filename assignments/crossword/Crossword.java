public class Crossword {
  public boolean fits(String s1, String s2){
    if(s2.indexOf("-")==-1){
      return s1==s2;
    } if(s2.length() != s1.length()){
      return false;
    }
    int n = s2.indexOf("-");
    return s2.substring(0,n)==(s1.substring(0,n));
  }
}
