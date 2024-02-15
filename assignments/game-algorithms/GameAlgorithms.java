public class GameAlgorithms {
  public boolean inBounds(int[][] list, int row, int col){
    if(row < list.length && row >= 0){
      return true;
    } else if(col < list[row].length && col >= 0){
      return true;
    } else {
      return false;
    }
  }

}
