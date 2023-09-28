import com.gigamonkeys.bhs.ImageGenerator;
import com.gigamonkeys.bhs.shapes.Square;
import java.awt.Color;
import java.awt.Graphics;

public class Squares implements ImageGenerator {

  private final Color LIGHT = new Color(212, 212, 212);
  private final Color DARK = new Color(64, 64, 64);

  /**
   * As with simple-graphics, this is the entry point that will be
   * called by the framework. You can use the arguments passed here to
   * make Square objects and draw with them.
   */
  public void draw(Graphics g, int width, int height) {
    checkerboard(new Square(g, 0, 0, 30), width, height);

    int startingSize = (int) (Math.min(width, height) * 0.8);
    int x = centered(width, startingSize);
    int y = centered(height, startingSize);

    Square s = new Square(g, x, y, startingSize);
    spiral(s, randomInt(101));
  }

  /**
   * This code draws the checkeboard, as you can probably tell from the
   * name. It uses for loops which you won't officially learn until Unit
   * 4 but you may be able to make out what's going on here.
   */
  public void checkerboard(Square check, int width, int height) {
    for (int i = 0; i < width / check.getSize(); i++) {
      for (int j = 0; j < height / check.getSize(); j++) {
        if ((i + j) % 2 == 0) {
          check.setColor(LIGHT);
        } else {
          check.setColor(DARK);
        }
        check.moveTo(i * check.getSize(), j * check.getSize());
        check.fill();
      }
    }
  }

  /**
   * This code also uses a for loop, this time to draw a spiral of
   * rotated squares.
   */
  public void spiral(Square s, int steps) {
    for (int i = 0; i < steps; i++) {
      s.setColor(randomColor());
      s.fill();
      s.shrinkToCenter(0.18);
      s.rotate(Math.TAU / steps);
    }
  }

  /**
   * A handy method for getting a random int between 0 and max - 1.
   */
  public int randomInt(int max) {
    return (int) (Math.random() * max);
  }

  /**
   * A handy method for getting a random, semi-transparent Color.
   */
  public Color randomColor() {
    return new Color(randomInt(255), randomInt(255), randomInt(255), 128);
  }

  /**
   * You may recognize this method from the recent assessment.
   */
  public int centered(int space, int size) {
    return (space - size) / 2;
  }
}
