public class StringsUnit2 {

  // Write methods here. They should be public but not static.
  public String firstCharacter(String n){
    return n.substring(0,1);
  }
  public String lastCharacter(String n){
    return n.substring(n.length()-1);
  }
  public String pair(String n, String o){
    return n + " and " + o; 
  }
  public boolean longerThan(String n, String o){
    return n.length()>o.length();
  }
  public String upDown(String n){
    return n.toUpperCase()+n.toLowerCase();
  }
  public boolean contains(String n, String o){
    return 0<=n.indexOf(o);
  }
  public String slug(String n, String o, String p){
    return n.toLowerCase()+"-"+o.toLowerCase()+"-"+p.toLowerCase();
  }

}
