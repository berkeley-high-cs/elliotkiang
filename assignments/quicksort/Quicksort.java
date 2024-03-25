import java.util.*;

public class Quicksort {
  public ArrayList<Integer> quicksort(ArrayList<Integer> list){
    int pivot = list.get(0);
    ArrayList<Integer> bigger = new ArrayList<Integer>();
    ArrayList<Integer> smaller = new ArrayList<Integer>();
    for(int i = 0; i < list.size(); i++)
      if(list.get(i) > pivot){
        bigger.add(list.get(i));
      } else {
        smaller.add(list.get(i));
      }
      return bigger;
  }

}
