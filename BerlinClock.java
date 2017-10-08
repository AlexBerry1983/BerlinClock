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

  public String getTopMinutes(int minutes){
    String topMinutes = "OOOOOOOOOOO";
    switch(minutes / 5){
      case 1: topMinutes = "YOOOOOOOOOO";
              break;
      case 2: topMinutes = "YYOOOOOOOOO";
              break;
      case 3: topMinutes = "YYROOOOOOOO";
              break;
      case 4: topMinutes = "YYRYOOOOOOO";
              break;
      case 5: topMinutes = "YYRYYOOOOOO";
              break;
      case 6: topMinutes = "YYRYYROOOOO";
              break;
      case 7: topMinutes = "YYRYYRYOOOO";
              break;
      case 8: topMinutes = "YYRYYRYYOOO";
              break;
      case 9: topMinutes = "YYRYYRYYROO";
              break;
      case 10: topMinutes = "YYRYYRYYRYO";
               break;
      case 11: topMinutes = "YYRYYRYYRYY";
               break;
    }
    return topMinutes;
  }

}
