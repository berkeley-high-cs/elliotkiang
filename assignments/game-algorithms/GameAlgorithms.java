public class GameAlgorithms {
  public boolean inBounds(int[][] list, int row, int col){
    if(row < list.length){
      return false;
    } else if(col < list[row].length){
      return false;
    } else {
      return true;
    }
  }

}
