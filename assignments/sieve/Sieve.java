public class Sieve {
  public int[] numberTable(int n){
    int[] ray = new int[n];
    for(int i=0;i<ray.length;i++){
      ray[i]=i;
    }
    return ray;
  }
}
