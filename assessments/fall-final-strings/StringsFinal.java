public class StringsFinal {

  public boolean isEmpty(String word) {
    return (word.length() == 0);
  }

  public String nameOfCity() {
    return "Berkeley";
  }

  public String shout(String word) {
    return (word.toUpperCase());
  }

  public String whisper(String word) {
    return (word.toLowerCase());
  }

  public String longer(String former, String latter) {
    if (former.length() >= latter.length()) {
      return former;
    } else {
      return latter;
    }
  }
  public boolean isAtLeastNCharactersLong(String word, int n){
    return(word.length()>=n);
  }
  public String whichCameFirst(String chickEgg){
    if(chickEgg.indexOf("chicken")<chickEgg.indexOf("egg")){
      return "chicken";
    } else {
      return "egg";
    }
  }
  public boolean isPlural(String word){
    return("s" == word.substring(word.length()-1));
  }
  public boolean combineToSame(String word1,String word2,String word3,String word4){
    String one = word1+word2;
    String two = word3+word4;
    return(one.equals(two));
  }
  public String email(String firstName, String lastName, String domainName){
    String emailAddress = firstName.substring(0,1).toLowerCase()+lastName.toLowerCase()+"@"+domainName.toLowerCase();
    return emailAddress;
  }
  public boolean isPalindrome(String palindrome){
    int yes = 0;
    for(int i=0;i<palindrome.length;i++){
      if(palindrome.substring(i,i+1)==palindrome.length()-(1+i)){
        yes++;
      }
    } 
    return (yes=palindrome.length()/2);
  }
  // Your code goes here

}
