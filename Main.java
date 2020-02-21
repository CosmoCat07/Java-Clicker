import cosmocat07.clicker.Clicker;
import cosmocat07.clicker.Goal;
import cosmocat07.variables.MainVar;
import java.util.Scanner;
import java.util.InputMismatchException;
import cosmocat07.useful.Random;
import java.util.HashMap;
import cosmocat07.clicker.directions.InstructionsMain;
//import java.time.LocalTime;

public class Main extends MainVar {

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    Clicker gameStarter = new Clicker();
    Goal goalSetter = new Goal();
    InstructionsMain ruleList = new InstructionsMain();
    // LocalTime timeStamp = LocalTime.now();
    // int cooldown = timeStamp.getSecond();
    // int nextClick = timeStamp.minusSeconds(CALENDAR.1s);
    /*
     * if (goal instanceof java.lang.String) { throw new
     * NumberFormatException("Please Enter A Number"); }
     */
    HashMap<Double, String> color = new HashMap<Double, String>();
    color.put(1d, "\033[0;38;2;255;0;0m");
    color.put(2d, "\033[0;38;2;254;127;0m");
    color.put(3d, "\033[0;38;2;255;255;0m");
    color.put(4d, "\033[0;38;2;0;255;0m");
    color.put(5d, "\033[0;38;2;0;255;255m");
    color.put(6d, "\033[0;38;2;0;0;255m");
    color.put(7d, "\033[0;38;2;255;0;255m");
    int colorMax = color.size();
    double colorSelector = Random.getRandomInteger(1, colorMax);
    System.out.print(color.get(colorSelector));

    System.out.println("Welcome to Java Clicker!!!");
    System.out.println("Press Enter to Start!!!");
    System.out.println("Enter The Word \"Rules\" to see the Rules!!!");
    switch (myObj.nextLine().toLowerCase()) {
      case "rules":
      while (rulesKnown == false) {
        ruleList.showContents();        
      }
      break;
      case "max goal":
      goal = Long.MAX_VALUE;
      goalReady = true;
      default:
      rulesKnown = true;
    }

    if (rulesKnown == true) {
      goalSetter.setGoal();

    startReady = true;
    if (goal <= 0) {
      cheats += 1;
      ;
    }
    // Main gameStarter = new Main();
    System.out.println("Click to Earn Points");
    System.out.println("Enter upgrade to increase your points per click");

    // clicker()

    System.out.println("You need " + upgradeCost + " points to buy your first upgrade.");

    if (startReady == true) {
      gameStarter.clickerStart();
    }

    while (gameEnd == false) {

      if (i == 7) {
        System.out.println("Would you like to play again?");
        switch (myObj.nextLine().toLowerCase()) {
        case "yes":
          points = 0;
          pointsUp = 0;
          lifetimePoints = 0;
          clicks = 0;
          upgradeCost = (int) Math.floor(pointsUp * upgradeMultiplier - points);
          totalUpCost = (int) upgradeCost + points;
          multiplierUpLevel = 20;
          bonusMultiplier = 5;
          System.out.println("What would you like your new goal to be?");
          goalReady = false;
          goalSetter.setGoal();
          i = 4;
          gameStarter.clickerStart();
          break;
        case "no":
          gameEnd = true;
          break;
        }
      }
    }
  }
}

    }