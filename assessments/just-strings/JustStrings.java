import java.util.ArrayList;

public class JustStrings {

  public boolean isVowel(String c) {
    return "aeiou".indexOf(c) != -1;
  }
  public String insert(String base, String add, int pos){
    base = base.substring(0,pos) + add + base.substring(pos);
    return base;
  }
  public String deleteFirst(String base, String remove){
    return base;
  }
}
