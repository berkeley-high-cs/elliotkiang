public class GameAlgorithms {
  public boolean inBounds(int[][] list, int row, int col){
    if((row >= 0 && row < list.length) && (col >= 0 && col < list[row].length)){
        return true;
    }
      return false;
  }
   public int sum4Neighbors(int[][] array, int row, int col){
    int sum = 0;
    if(inBounds(array, row, col)){
      for(int i = 1 ; i > -2 ; i--){
        for(int o = -1 ; o < 2 ; o++){
          if(inBounds(array,row + i, col + o)){
            if(i == 1 && o == 0){
              sum += array[row + i][col + o];
            } else if(i == 0 && (o == -1 || o == 1)){
              sum += array[row + i][col + o];
            } else if(i == -1 && o == 0){
              sum += array[row + i][col + o];
            }
         }
        }
      }
    }
    return sum;
    }
  }
  public int sum8Neighbors(int[][] array, int row, int col){
    int sum = 0;
    if(inBounds(array, row, col)){
      for(int i = 1 ; i > -2 ; i--){
        for(int o = -1 ; o < 2 ; o++){
          if(inBounds(array,row + i, col + o) && !(o == 0 && i == 0)){
            sum += array[row + i][col + o];
         }
        }
      }
    }
    return sum;
  }
  public boolean areNeighbors(int row1, int col1, int row2, int col2){
      for(int i = 1 ; i > -2 ; i--){
        for(int o = -1 ; o < 2 ; o++){
          if((row1+i == row2) && (col1+o == col2)){
            return true;
         }
        }
      return false;
      }
    }
  }
}
