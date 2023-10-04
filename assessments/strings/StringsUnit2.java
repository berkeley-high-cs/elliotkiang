public class StringsUnit2 {

  // Write methods here. They should be public but not static.
  public String firstCharacter(String s){
    return s.substring(0,1);
  }
  public String lastCharacter(String s){
    return s.substring(s.length()-1);
  }
  public String pair(String s, String t){
    return s + " and " + t; 
  }
  public boolean longerThan(String s, String t){
    return s.length()>t.length();
  }
  public String upDown(String s){
    return s.toUpperCase()+s.toLowerCase();
  }
  public boolean contains(String s, String t){
    return 0<=s.indexOf(t);
  }
  public String slug(String s, String t, String u){
    return s.toLowerCase()+"-"+t.toLowerCase()+"-"+u.toLowerCase();
  }
  public String simplePigLatin(String s, int n){
    return s.substring(n)+s.substring(0,n)+"ay";
  }
  public String capitalize(String s){
    return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
  }
  public String oneCharacter(String s, int n){
    return s.substring(n,n+1);
  }
  public String firstHalf(String s){
    return s.substring(0,s.length()/2);
  }
}
