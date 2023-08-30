import com.gigamonkeys.bhs.*;

public class MyPicture implements Picture {

  public void draw(Canvas c) {
    for (var x = 0; x < c.width(); x += 20) {
      c.drawLine(x, 0, x, c.height(), "rgba(0, 128, 192, 0.5)", 2);
    }
    c.drawLine(0, 0, c.width(), c.height(), "white", 100);
    c.drawLine(0, c.height(), c.width(), 0, "red", 100);
    c.drawFilledCircle(c.width() / 2, c.height() / 2, 100.0, "blue");
    c.drawFilledRect(20, 20, c.width() - 40, c.height() - 40, "#ff00ff20");
  }
}
