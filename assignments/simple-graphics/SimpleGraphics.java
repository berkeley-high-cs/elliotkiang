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
    g.fillOval(width/3+100,height/2-50, 100, 100);
    g.setColor(Color.YELLOW);
    g.fillOval(width/3,height/2-50,100,100);
    g.setColor(Color.RED);
    g.fillOval(width/3-100,height/2-50, 100, 100);
  }

}
