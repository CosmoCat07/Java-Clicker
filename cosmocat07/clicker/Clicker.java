package cosmocat07.clicker;

import java.util.Scanner;
import cosmocat07.clicker.*;
import cosmocat07.variables.MainVar;
import cosmocat07.clicker.cheats.BonusTest;
import cosmocat07.useful.Clear;

public class Clicker extends MainVar {

  Bonus randomObj = new Bonus();
  BonusTest bonusTest = new BonusTest();
  Clear clear = new Clear();
  Scanner myObj = new Scanner(System.in);
  Upgrade upgrader = new Upgrade();

  public void clickerStart() {
    while (i < 6) {
      if (goal <= points) {
        clear.clearScreen();
        System.out.println("Congratulations! You Win!");
        System.out.println("Your final points per click: " + pointsUp);
        System.out.println("Your lifetime points: " + lifetimePoints);
        System.out.println("Your total clicks: " + clicks);
        if (cheats >= 1) {
          System.out.println("Cheats Used: " + cheats);
        }
        i = 7;
      }
      // if (timeStamp - 1 >= cooldown) {
      upgradeCost = (int) Math.floor(pointsUp * upgradeMultiplier - points);
      ++clicks;
      switch (myObj.nextLine().toLowerCase()) {
      case "clear":
        i = 7;
        clear.clearScreen();
        System.out.println("Game Over");
        break;
      case "upgrade":
        upgrader.upgradePointsUp();
        break;
      case "u":
        upgrader.upgradePointsUp();
        break;
      case "upgrade cost":
        System.out.println("You need a total of " + totalUpCost + " points to upgrade.");
        break;
      case "bonus test":
        bonusTest.bonusTest();
        break;
      default:
        randomObj.bonus();
        randomObj.bonusUpgrade(/* pointsUp, multiplierUpLevel, bonusAmount, points, bonusMultiplier */);
        if (breakSwitch == true) {
          breakSwitch = false;
          break;
        }
        points += pointsUp;
        lifetimePoints += pointsUp;
        System.out.println(points);
      }
    }
  }
}