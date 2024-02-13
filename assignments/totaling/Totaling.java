import java.util.ArrayList;

public class Totaling {

  // You'll need to use this method
  public boolean isPrime(int n) {
    if (n < 2) return false;
    for (int d = 2; d <= Math.sqrt(n); d++) {
      if (n % d == 0) return false;
    }
    return true;
  }
  public int sumArray(int[] numList){
    int sum = 0;
    for(int i = 0; i < numList.length; i++){
      sum += numList[i];
    }
    return sum;
  }
  public int sumList(ArrayList<Integer> numList){
    int sum = 0;
    for(int i = 0; i < numList.size(); i++){
      sum += numList.get(i);
    }
    return sum;
  }
  public int sumPrimes(ArrayList<Integer> numList){
    int sum = 0;
    for(int i = 0; i < numList.size(); i++){
      if(isPrime(numList.get(i)))
      sum += numList.get(i);
    }
    return sum;
  }
  public int sumCells(int[][] numCells){
    int sum = 0;
    for(int i = 0; i > numCells.length; i++){
      for(int o = 0; o > numCells[i].length; o++){
      sum += numCells[i][o];
      }
    }
    return sum;
  }
}
