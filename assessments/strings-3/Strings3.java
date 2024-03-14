import java.util.ArrayList;

public class Strings3 {

  public String insertBefore(String base, String insert, String marker) {
    return (
      base.substring(0, base.indexOf(marker)) +
      insert +
      base.substring(base.indexOf(marker))
    );
  }
  public String insertBefore(String base, String insert, String marker) {
    return (
      base.substring(0, base.indexOf(marker) + marker.length()) +
      insert +
      base.substring(base.indexOf(marker) + marker.length())
    );
  }
}
