import java.util.*;

public class BerlinClock{

  private String twoSecondLamp = "";
  private String[] fiveHourLamps = {"O", "O", "O", "O"};
  private String[] oneHourLamps = {"O", "O", "O", "O"};
  private String[] fiveMinuteLamps = {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"};
  private String[] oneMinuteLamps = {"O", "O", "O", "O"};

  public BerlinClock(){
    this.twoSecondLamp = "";
    this.fiveHourLamps = fiveHourLamps;
    this.oneHourLamps = oneHourLamps;
    this.fiveMinuteLamps = fiveMinuteLamps;
    this.oneMinuteLamps = oneMinuteLamps;
  }

  public String getSeconds(int seconds){
    if(seconds % 2 == 0){
      this.twoSecondLamp = "Y";
      return this.twoSecondLamp;
    } else {
      this.twoSecondLamp = "O";
    }
    return this.twoSecondLamp;
  }

  public String getTopHours(int hours){
    String lampResult = "";
    if(hours < 5){
      lampResult = getStringResult(this.fiveHourLamps);
    } else if (hours >= 5 && hours < 10){
      this.fiveHourLamps[0] = "R";
      lampResult = getStringResult(this.fiveHourLamps);
    } else if (hours >= 10 && hours < 15){
      this.fiveHourLamps[0] = "R";
      this.fiveHourLamps[1] = "R";
      lampResult = getStringResult(this.fiveHourLamps);
    } else if (hours >= 15 && hours < 20){
      this.fiveHourLamps[0] = "R";
      this.fiveHourLamps[1] = "R";
      this.fiveHourLamps[2] = "R";
      lampResult = getStringResult(this.fiveHourLamps);
    } else if (hours >= 20 && hours <= 24){
      for(int i = 0; i < this.fiveHourLamps.length; i ++){
        this.fiveHourLamps[i] = "R";
      }
      lampResult = getStringResult(this.fiveHourLamps);
    } else {
      return "Error! You must enter a number between 0-24";
    }
    return lampResult;
  }

  public String getStringResult(String[] lampsArray){
    String result = "";
    for(String lamp: lampsArray){
      result = result + lamp;
    }
    return result;
  }

  public String getBottomHours(int hours){
    double remainingHours = Math.round(hours % 5);
    int intvalue = (int) remainingHours;
    // System.out.println(intvalue);
    switch(intvalue){
      case 1: this.oneHourLamps[0] = "R";
              break;
      case 2: this.oneHourLamps[0] = "R";
              this.oneHourLamps[1] = "R";
              break;
      case 3: this.oneHourLamps[0] = "R";
              this.oneHourLamps[1] = "R";
              this.oneHourLamps[2] = "R";
              break;
      case 4: for(int i = 0; i < this.oneHourLamps.length; i++){
                this.oneHourLamps[i] = "R";
              }
              break;
      }
      String lampResult = getStringResult(this.oneHourLamps);
      return lampResult;
  }

}
