public class GameAlgorithms {
  public boolean inBounds(int[][] list, int row, int col){
    if(row >= 0 && col >= 0){ //row < list.length && 
      if(col < list[row].length && row < list.length){
        return true;
      }
    }
      return false;
  }

}
