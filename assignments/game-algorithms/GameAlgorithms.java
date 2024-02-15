public class GameAlgorithms {
  public boolean inBounds(int[][] list, int row, int col){
    if((row >= 0 && row < list.length) && (col >= 0 && col < list[row].length)){
        return true;
    }
      return false;
  }
  public int sum8Neighbors(int[][] array, int row, int col){
    int sum = 0;
    if(inBounds(array, row, col)){
      for(int i = 1 ; i > -2 ; i--){
        System.out.println("0");
        for(int o = -1 ; o < 2 ; o++){
          System.out.println("1");
          if(inBounds(array,row + i, col + o)){
            sum += array[row + i][col + o];
          System.out.println("2");
         }
        }
      }
    }
    return sum;
  }

}
