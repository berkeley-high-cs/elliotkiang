/*
 * A number is prime if it is not divisible by any number other than 1 and
 * itself. 1 is not prime. Thus you can test whether a number greater than 1 is
 * prime by checking whether it is divisible by any smaller number greater than
 * one.
 */

public class Primes {

  public boolean isPrime(int n) {
    int i = 2;
    while (i <= Math.sqrt(n)) {
      if (n % i == 0) {
        return false;
      }
      i++;
    }
    return n != 1;
  }

  public int numberOfPrimesBelow(int n) {
    int count = 0;
    for (int i = 2; i < n; i++) {
      if (isPrime(i)) {
        count++;
      }
    }
    return count;
  }
  public int numberOfTwinPrimePairsBelow (int i){
    int count2 = 0;
    for (int i=2;i<n;i++){
      if(isPrime(i)&&(isPrime(i+2)||isPrime(i-2))){
        count2++;
      }
    }
    return count2;
  }
}
