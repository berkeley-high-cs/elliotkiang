import java.util.ArrayList;

public class JustStrings {

  public boolean isVowel(String c) {
    return "aeiou".indexOf(c) != -1;
  }

  public String insert(String base, String add, int pos) {
    return base.substring(0, pos) + add + base.substring(pos);
  }

  public String deleteFirst(String base, String remove) {
    return (
      base.substring(0, base.indexOf(remove)) +
      base.substring(base.indexOf(remove) + remove.length())
    );
  }

  public String deleteAll(String base, String remove) {
    while (base.indexOf(remove) != -1) {
      base =
        base.substring(0, base.indexOf(remove)) +
        base.substring(base.indexOf(remove) + remove.length());
    }
    return base;
  }

  public String nCharacters(String base, int n, int i) {
    return base.substring(i, i + n);
  }

  public String nCharactersBefore(String base, int n, String other) {
    return base.substring(base.indexOf(other) - n, base.indexOf(other));
  }

  public String nCharactersAfter(String base, int n, String other) {
    int firstPos = base.indexOf(other) + other.length();
    return base.substring(firstPos, firstPos + n);
  }
  public boolean isPalindrome(String s){
    return s.substring(0,s.length()/2) == s.substring(s.length()/2);
  }
  public String ubbieDubbie(String s){
    for(int i = 0; i < s.length(); i++){
      if(isVowel(s.substring(i,i+1))){
        s = s.substring(0,i) + "ub" + s.substring(i);
        if(isVowel(s.substring(i+1,i+2))){
          i+=2;
        }
        i+=2;
      }
    }
    return s;
  }
}
