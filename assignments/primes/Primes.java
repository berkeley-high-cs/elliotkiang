/*
 * A number is prime if it is not divisible by any number other than 1 and
 * itself. 1 is not prime. Thus you can test whether a number greater than 1 is
 * prime by checking whether it is divisible by any smaller number greater than
 * one.
 */

public class Primes {
  public boolean isPrime(int n){
  int i=2;
  while(i<=Math.sqrt(n)){
    i++;
    if(n%i==0){
      return false;
      }
    }
  return n!=1;
  }
  public int numberOfPrimesBelow(int n){
    int count=0;
    int i=0;
    while(i<n){
      if(isPrime(i)){
        count++;
      }
      i++;
    }
    return count;
  }
}


