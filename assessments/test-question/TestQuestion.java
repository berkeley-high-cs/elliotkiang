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
  public double getPoints(){
    return points;
  }
  public void setQuestion(String newQues){
    question = newQues;
  }
  public void setPoints(double newPoint){
    points = newPoint;
  }
  public double score(double credit){
    return credit*points;
  }
}