public class LeapYear {
  public boolean isLeapYear(int year){
    return year % 4 == 0 && year % 100 != 0;
  }
  public numberOfLeapYears(int firstYear, int secondYear){
    return (secondYear - firstYear)/4;
  }

}
