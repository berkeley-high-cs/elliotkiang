import java.util.*;

public class Solver extends Helper3 {

  public class Solver extends Helper2 {

    public boolean inBounds(int row, int col, String[][] array) {
      return (
        (row < array.length && row >= 0) &&
        (col < array[row].length && col >= 0)
      );
    }
  }
}
