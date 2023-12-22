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
  public boolean isAtLeastNCharactersLong (String word, int n){
    return(word.length()>=n);
  }
  // Your code goes here

}
