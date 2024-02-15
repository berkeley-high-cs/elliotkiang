public class GameAlgorithms {
  public boolean inBounds(int[][] list, int row, int col){
    if((row >= 0 && row < list.length) && (col >= 0 && col < list[row].length)){
        return true;
    }
      return false;
  }

}
