public class ControlConstructsFinal {
  public void fill(int[] nums, int replacement){
    for(int i=0;i<nums.length;i++){
      nums[i]=replacement;
    }
  }
  public String letterGrade(double score){
    if(score>=0.9){
      return "A";
    } else if(score>=0.8){
      return "B";
    } else if(score>=0.7){
      return "C";
    } else if(score>=0.6){
      return "D";
    } else {
      return "F";
    }
  }
  // Your code goes here

}
