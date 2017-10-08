import java.util.*;

public class BerlinClock {


  public BerlinClock(){

  }

  public String getSeconds(int seconds){
    if(seconds % 2 == 0){
      return "Y";
    } else {
      return "O";
    }
  }

  public String getTopHours(int hours){
    String topHoursString = "OOOO";
      if (hours >= 5 && hours < 10){
      topHoursString = "ROOO";
    } else if (hours >= 10 && hours < 15){
      topHoursString = "RROO";
    } else if (hours >= 15 && hours < 20){
      topHoursString = "RRRO";
    } else if (hours >= 20 && hours < 25){
      topHoursString = "RRRR";
    }
    return topHoursString;
  }

  public String getBottomHours(int hours){
    String bottomHoursString = "OOOO";
    int remainingHours = Math.round(hours % 5);
    switch(remainingHours){
      case 1: bottomHoursString = "ROOO";
              break;
      case 2: bottomHoursString = "RROO";
              break;
      case 3: bottomHoursString = "RRRO";
              break;
      case 4: bottomHoursString = "RRRR";
              break;
    }
    return bottomHoursString;
  }

}
