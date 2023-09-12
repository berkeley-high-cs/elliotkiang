import java.awt.Color;
import java.awt.Graphics;

import com.gigamonkeys.bhs.*;

public class SimpleGraphics implements ImageGenerator {

  // You can put whatever code you want in this method. When it is run it will
  // create an image of size width x height which will be displayed over on the
  // right. If you want to make a complex image you may want to define new
  // methods to draw different parts and then call them from this method.
  // (You'll need to pass the Graphics object g to those methods.)
  public void draw(Graphics g, int width, int height) {
    g.setColor(Color.GREEN);
    g.fillRect(0, 0, 250, 1000);
    g.setColor(Color.RED);
    g.fillRect(250, 0, 250, 1000);
    g.setColor(Color.YELLOW);
    g.fillRect(500, 0, 250, 1000);
    g.setColor(Color.PINK);
    g.fillOval(225,60,300,300);

  }

}
