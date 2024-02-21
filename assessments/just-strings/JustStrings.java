import java.util.ArrayList;

public class JustStrings {

  public boolean isVowel(String c) {
    return "aeiou".indexOf(c) != -1;
  }
  public String insert(String base, String add, int pos){
    return base.substring(0,pos) + add + base.substring(pos);
  }
  public String deleteFirst(String base, String remove){
    return base.substring(0,base.indexOf(remove)) + base.substring(base.indexOf(remove)+remove.length());
  }
  public String deleteAll(String base, String remove){
    while(base.indexOf(remove) != -1){
      base = base.substring(0,base.indexOf(remove)) + base.substring(base.indexOf(remove)+remove.length());
    }
    return base;
  }
  public String nCharacters(String base, int n, int i){
    return base.substring(i,i+n);
  }
}
