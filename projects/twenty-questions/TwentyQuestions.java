import java.util.Scanner;

/**
 * Play the classic game Twenty Questions. Though you'll probably actually only
 * implement Three Questions or Four Questions if you are extremely ambitious.
 */
public class TwentyQuestions {

  // Use input.readLine() to read a line at a time
  // as a String from the user.
  private Scanner input = new Scanner(System.in);

  public void play() {
    String win = "cower before me, puny mortal";
    String lose = "aw shucks";
    System.out.print("Is it alive? ");
    String answer = input.nextLine();
    if (answer.toLowerCase().startsWith("y")) {
      System.out.println("Does it live in the ocean?");
      String answer1 = input.nextLine();
      if (answer1.toLowerCase().startsWith("y"))
      {
        System.out.println("Does it have fins?");
        String answer2 = input.nextLine();
        if (answer2.toLowerCase().startsWith("y")){
          System.out.println("Is it a shark?");
          String answerF = input.nextLine();
        if (answerF.toLowerCase().startsWith("y")){
          System.out.println(win);
        } else
        {
          System.out.println(lose);
        }
          
        } else
      {
        System.out.println("Is it a sea slug?");
        String answerF = input.nextLine();
        if (answerF.toLowerCase().startsWith("y")){
          System.out.println(win);
        } else
        {
          System.out.println(lose);
        }
      }
      } else
      {
        System.out.println("Does it have fur?");
        String answer3 = input.nextLine();
        if (answer3.toLowerCase().startsWith("y")){
          System.out.println("Is it a sloth?");
          String answerF = input.nextLine();
        if (answerF.toLowerCase().startsWith("y")){
          System.out.println(win);
        } else
        {
          System.out.println(lose);
        }
        }
        else {
          System.out.println("Is it a person?");
          String answerF = input.nextLine();
        if (answerF.toLowerCase().startsWith("y")){
          System.out.println(win);
        } else
        {
          System.out.println(lose);
        }
        }
      }
    } else {
      System.out.println("Is it gray?");
      String answer1 = input.nextLine();
      if (answer1.toLowerCase().startsWith("y")){
        System.out.println("Is it hard?");
        String answer2 = input.nextLine();
        if (answer2.toLowerCase().startsWith("y")){
          System.out.println("Is it a rock?");
          String answerF = input.nextLine();
        if (answerF.toLowerCase().startsWith("y")){
          System.out.println(win);
        } else
        {
          System.out.println(lose);
        }
        } else {
          System.out.println("Is it ashes?");
          String answerF = input.nextLine();
        if (answerF.toLowerCase().startsWith("y")){
          System.out.println(win);
        } else
        {
          System.out.println(lose);
        }
        }
      } else {
        System.out.println("Is it in nature?");
        String answer3 = input.nextLine();
        if (answer3.toLowerCase().startsWith("y")){
          System.out.println("Is it dirt?");
          String answerF = input.nextLine();
        if (answerF.toLowerCase().startsWith("y")){
          System.out.println(win);
        } else
        {
          System.out.println(lose);
        }
        }
        else {
          System.out.println("Is it glass?");
          String answerF = input.nextLine();
        if (answerF.toLowerCase().startsWith("y")){
          System.out.println(win);
        } else
        {
          System.out.println(lose);
        }
        }
      }
    }
  }

  public static void main(String[] args) {
    new TwentyQuestions().play();
  }
}
