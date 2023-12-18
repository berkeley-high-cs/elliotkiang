public class TestQuestion{
  private String id;
  private String question;
  private double points;

  public TestQuestion(String testName, int questionNum, String question, double pointVal){
    id = testName;
    this.question = question;
    points = pointVal;
  }
  public String getId(){
    return id;
  }
  public String getQuestion(){
    return question;
  }
  public String getPoints(){
    return points;
  }
}