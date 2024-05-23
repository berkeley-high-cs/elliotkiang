import java.util.*;
public class Adventure {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("You see a computer screen and an almost empty Java file.\n\n> ");
    String command = input.nextLine();
    if (command.equalsIgnoreCase("write code")) {
      System.out.println("\nA masterpiece! You win!\n");
    } else {
      System.out.println("\nSorry, you are eaten by a troll. Game over.\n");
    }
    input.close();
  }
}
