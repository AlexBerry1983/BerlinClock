import java.util.*;
import java.math.*;

public class BerlinClock {

  private String[] clockContainer = {"", "", "", "", ""};
  private ArrayList<String> seconds = new ArrayList<String>();
  private ArrayList<String> topHours = new ArrayList<String>();
  private ArrayList<String> bottomHours = new ArrayList<String>();
  private ArrayList<String> topMinutes = new ArrayList<String>();
  private ArrayList<String> bottomMinutes = new ArrayList<String>();

  public BerlinClock(){
    this.clockContainer = clockContainer;
    this.seconds = seconds;
    this.topHours = topHours;
    this.bottomHours = bottomHours;
    this.topMinutes = topMinutes;
    this.bottomMinutes = bottomMinutes;
  }

  public String getSeconds(int seconds){
    String secondsString = "O";
    if(seconds % 2 == 0){
      secondsString = "Y";
    }
    updateArrayList(secondsString, this.seconds);
    return secondsString;
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
    updateArrayList(topHoursString, this.topHours);
    return topHoursString;
  }

  public void updateArrayList(String stringToAdd, ArrayList listToUpdate){
    listToUpdate.clear();
    char[] lettersToAdd = stringToAdd.toCharArray();
    for(char letter: lettersToAdd){
      listToUpdate.add(Character.toString(letter));
    }
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
    updateArrayList(bottomHoursString, this.bottomHours);
    return bottomHoursString;
  }

  public String getTopMinutes(int minutes){
    String topMinutesString = "OOOOOOOOOOO";
    switch(minutes / 5){
      case 1: topMinutesString = "YOOOOOOOOOO";
              break;
      case 2: topMinutesString = "YYOOOOOOOOO";
              break;
      case 3: topMinutesString = "YYROOOOOOOO";
              break;
      case 4: topMinutesString = "YYRYOOOOOOO";
              break;
      case 5: topMinutesString = "YYRYYOOOOOO";
              break;
      case 6: topMinutesString = "YYRYYROOOOO";
              break;
      case 7: topMinutesString = "YYRYYRYOOOO";
              break;
      case 8: topMinutesString = "YYRYYRYYOOO";
              break;
      case 9: topMinutesString = "YYRYYRYYROO";
              break;
      case 10: topMinutesString = "YYRYYRYYRYO";
               break;
      case 11: topMinutesString = "YYRYYRYYRYY";
               break;
    }
    updateArrayList(topMinutesString, this.topMinutes);
    return topMinutesString;
  }

  public String getBottomMinutes(int minutes){
    String bottomMinutesString = "OOOO";
    int bottomMinutesToLight = Math.round(minutes % 5);
    switch(bottomMinutesToLight){
      case 1: bottomMinutesString = "YOOO";
              break;
      case 2: bottomMinutesString = "YYOO";
              break;
      case 3: bottomMinutesString = "YYYO";
              break;
      case 4: bottomMinutesString = "YYYY";
    }
    updateArrayList(bottomMinutesString, this.bottomMinutes);
    return bottomMinutesString;
  }

  public String[] convertToBerlinTime(String timeToConvert){
    String[] timeArray = timeToConvert.split(":");
    String secondsString = timeArray[2];
    String hoursString = timeArray[0];
    String minutesString = timeArray[1];

    int secondsInt = Integer.valueOf(secondsString);
    int topHoursInt = Integer.valueOf(hoursString);
    int bottomHoursInt = Integer.valueOf(hoursString);
    int topMinutessInt = Integer.valueOf(minutesString);
    int bottomMinutesInt = Integer.valueOf(minutesString);

    this.clockContainer[0] = getSeconds(secondsInt);
    this.clockContainer[1] = getTopHours(topHoursInt);
    this.clockContainer[2] = getBottomHours(bottomHoursInt);
    this.clockContainer[3] = getTopMinutes(topMinutessInt);
    this.clockContainer[4] = getBottomMinutes(bottomMinutesInt);

    return this.clockContainer;
   }

}
