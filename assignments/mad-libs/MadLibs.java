public class MadLibs {

  // These are arrays. We will cover them properly in Unit 6. They are used to
  // represent a list of values, in this case a list of Strings. You may want to
  // introduce your own arrays following the pattern here.

  private String[] names = { "Olivia", "Emma", "Charlotte", "Amelia", "Sophia", "Isabella", "Ava", "Mia" };

  private String[] adjectives = { "radiant", "glowing", "glum", "bespeckled", "enraged", "hungry", "sleepy" };

  private String[] verbs = { "walk", "jump", "tip-toe", "vault", "shower", "learn" };
  
  private String[] nouns = {"bucket", "book", "magazine", "detached arm", "classroom", "computer"};

  // This method chooses a random element from the array passed as its argument.
  // For instance given the definition of names above, chooseFrom(names) will
  // return one of "Wilma", "Betty", "Fred", or "Barney" each time it is called.
  public String cF(String[] choices) {
    return choices[(int) (Math.random() * choices.length)];
  }
  public String ing(String verb){
    return verb + "ing";
  }
  public String ed(String verb){
    return verb + "ed";
  }

  // This is a sample method that produces a sentence filling in some values
  // just like when you fill in the blanks in a MadLib. You should write several
  // more of these to make a full MadLib.
  public String sentenceOne(String name, String adjective, String verb) {
    return "Hello " + name + ", you're looking " + adjective + " as you " + verb +" today.";
  }
  public String sentenceTwo(String name, String adjective, String verb, String noun) {
    return name + " " + ed(verb) + " up to the " + adjective + " " + noun;
  } // TODO: write more sentence methods.

  // This method is the entry point for generating a full MadLib. It should call
  // all your sentence methods with appropriate arguments, probably obtained by
  // calling chooseFrom with a suitable array of choices. It should concatnate
  // the results of all the sentence methods with the + operator to produce one
  // string contaning the whole output.
  public String generate() {
    return sentenceOne(cF(names), cF(adjectives), cF(verbs)) + " " + sentenceTwo(cF(names), cF(adjectives), cF(verbs), cF(nouns)); 
  }

  // You don't need to touch this method. It just calls your generate method and
  // prints the result.
  public static void main(String[] argv) throws Exception {
    System.out.println(new MadLibs().generate());
  }
}
