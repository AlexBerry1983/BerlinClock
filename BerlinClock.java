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
    // if(hours < 5){
    //   return this.fiveHourLamps;
    // }
    String result = "";
    for(String lamp: this.fiveHourLamps){
      result = result + lamp;
    }
    return result;
  }
}
