public class CountVowels {

  public boolean isVowel(String s) {
    if (s.length() != 1) return false;
    return "aeiou".indexOf(s.toLowerCase()) != -1;
  }
  public int countVowels(String s){
    if(s.length()==1&&isVowel(s)){
      return 1;
    } else{
      int count = 0;
      for (int i;i<=s.length();i++){
        if (isVowel(s.substring(i,i+1))){
          count++;
        }
      }
    }
  }


}
