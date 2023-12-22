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
  public int countOddNeighbors(int[] nums){
    int count=0;
    for(int i=0;i<nums.length-1;i++){
      if(nums[i]%2==1&&nums[i+1]%2==1){
        count++;
      }
    }
    return count;
  }
  public int totalOddNumbers(int[]nums){
    int oddTotal=0;
    for(int i=0;i<nums.length;i++){
      if(nums[i]%2==1){
        oddTotal+=nums[i];
      }
    }
    return oddTotal;
  }
  public int maxValue(int[] nums){
    int max=0;
    for(int i=0;i<nums.length;i++){
      if(nums[i]>max){
        max=nums[i];
      }
    }
      return max;
  }
  public String firstLetters(String[] words){
    String word;
    for(int i=0;i<words.length;i++){
      word = word + words[i].substring(0,1);
  }
  return word;
  }
  // Your code goes here

}
