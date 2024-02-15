public class GameAlgorithms {
  public boolean inBounds(int[][] list, int row, int col){
    if(row >= 0){ //row < list.length && 
      return true;
    } else if(col >= 0){ //col < list[row].length &&
      return true;
    } else {
      return false;
    }
  }

}
