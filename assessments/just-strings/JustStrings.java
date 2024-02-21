import java.util.ArrayList;

public class JustStrings {

  public boolean isVowel(String c) {
    return "aeiou".indexOf(c) != -1;
  }
  public String insert(String base, String add, int pos){
    return base.substring(0,pos) + add + base.substring(pos);;
  }
  public String deleteFirst(String base, String remove){

  }
}
