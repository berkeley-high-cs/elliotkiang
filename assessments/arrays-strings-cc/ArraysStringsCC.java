public class ArraysStringsCC {

  /*
   * Returns true if its argument is a single-character string and a vowel.
   */
  public boolean isVowel(String s) {
    return s.length() == 1 && "aeiou".indexOf(s.toLowerCase()) != -1;
  }

  /*
   * Returns true if its argument is a prime number.
   */
  public boolean isPrime(int n) {
    for (int d = 2; d <= Math.sqrt(n); d++) {
      if (n % d == 0) return false;
    }
    return n > 1;
  }
  public int countPrimes(int[] list){
    int count = 0;
    for(int i=0;i<list.length;i++){
      if(isPrime(list[i])){
        count++;
      }
    }
    return count;
  }
  public int countVowels(String word){
    int count = 0;
    for(int i=0;i<word.length();i++){
      if(isVowel(word.substring(i))){
        count++;
      }
    }
    return count;
  }
}
