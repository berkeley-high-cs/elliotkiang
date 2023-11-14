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
    for(int i=0;i<a.length;i++){
      if(i>n&&i%n==0){
        a[i]=0;
      }
    }
    return a;
  }
}