public class Sieve {
  public int[] numberTable(int n){
    int[] ray = new int[n];
    for(int i=0;i<ray.length;i++){
      ray[i]=i;
    }
    return ray;
  }
  public int countNonZeros(int[] a){
    int count=0;
    for(int i=0;i<a.length;i++){
      if(a[i]!=0){
        count++;
      }
    }
    return count;
  }
  public int[] clearMultiples(int[] a, int n){
    for(int i=n+1;i<a.length;i++){
      if(i % n == 0){
        a[i]=0;
      }
    }
    return a;
  }
  public int[] nonZeros(int[] a){
    int[]b = new int[countNonZeros(a)];
    int pos = 0;
    for(int i=0;i<a.length;i++){
      if(a[i] != 0){
        b[pos]=a[i];
        pos++;
      }
    }
    return b;
  }
  public int nextNonZero(int[] a, int startPos){
    for(int i=startPos+1;i<a.length;i++){
      if(a[i] != 0){
        return a[i];
      }
    }
    return 0;
  }
  public int[] primes(int size){
    int[] table = numberTable(size);
    return table;
  }
}