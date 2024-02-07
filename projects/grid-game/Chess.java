import java.awt.Color;
import java.awt.Graphics2D;

public class Chess extends GridGame {

  private Color[][] grid;
  private String[][] pieces;

  public Chess(int rows, int columns, int padding) {
    super(rows, columns, padding);
    grid = new Color[rows][columns];
    pieces = new String[rows][columns];
    boolean nextBlack = false;
    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < columns; c++) {
        if(nextBlack){
          grid[r][c] = Color.black;
        } else {
          grid[r][c] = Color.white;
        }
        nextBlack = !nextBlack;
      }
      nextBlack = !nextBlack;
    }
    for (int r = 0; r < 2; r++) {
      for (int c = 0; c < columns; c++) {
        pieces[r][c] = "♔";
      }
    }
    for (int r = 6; r < 8; r++) {
      for (int c = 0; c < columns; c++) {
        pieces[r][c] = "♚";
      }
    }
  }
  public void cellClicked(int row, int col) {
    Color old = grid[row][col];
    grid[row][col] = randomColor();
    repaint();
    after(
      500,
      () -> {
        grid[row][col] = old;
        repaint();
      }
    );
  }
  /*
   * This method will be called whenever you need to draw a cell. The Graphics2D
   * object is essentially the same one you used in the Flag but with a few more
   * methods. See:
   *
   * https://docs.oracle.com/en/java/javase/21/docs/api/java.desktop/java/awt/Graphics2D.html
   */
  public void paintCell(int row, int column, Graphics2D g) {
    g.setColor(grid[row][column]);
    g.fillRect(0, 0, cellWidth(), cellHeight());
  }

  /*
   * This method will be called for you when the user clicks a cell in the grid.
   */
  public boolean turnWhite = true;
    // You can't directly call a method to paint the component but the repaint
    // method (which you inherit from GridGame) tells the Swing framework that
    // this component needs to be repainted which will result in a call to
    // paintComponent (defined in GridGame) which will then cause paintCell to
    // be called for each cell.

    

  //////////////////////////////////////////////////////////////////////////////
  // Private helper methods.

  private void randomizeColors() {
    for (int r = 0; r < getRows(); r++) {
      for (int c = 0; c < getColumns(); c++) {
        grid[r][c] = randomColor();
      }
    }
  }

  private Color randomColor() {
    return new Color((int) (Math.random() * Integer.MAX_VALUE), false);
  }
}
