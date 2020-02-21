
package cosmocat07.clicker;
import java.util.Scanner;
import cosmocat07.variables.MainVar;

public class Bonus extends MainVar {

  Scanner myObj = new Scanner(System.in);

  public void bonusUpgrade() {
    if (bonusAmount <= points) {
      if (pointsUp >= multiplierUpLevel) {
      if (bonusTimeout == 0) {
        System.out.println("You can now upgrade your bonus multiplier for " + bonusAmount + " points!");
        System.out.println("Would you like to upgrade? Type yes or no");
        switch (myObj.nextLine().toLowerCase()) {
        case "yes":
          points -= bonusAmount;
          bonusMultiplier += 1;
          System.out.println("You will now earn more points from bonuses");
          multiplierUpLevel += 10;
          break;
        case "no":
          bonusTimeout = 5;
          break;
        default:
          break;
        }
      } else {
      --bonusTimeout;
    }
    }
    }
  }

  /*
   * public int multiplierReturn(int bonusMultiplier) {
   * 
   * }
   */

  public void bonus() {
    if (pointsUp >= 10) {
      bonusAmount = pointsUp * bonusMultiplier;
      randomChance = Math.floor(Math.random() * pointsUp) + 1;
      if (randomChance == 1) {
        points += bonusAmount;
        lifetimePoints += bonusAmount;
        System.out.println(points);
        System.out.println("You have gained " + bonusAmount + " bonus points!");
        breakSwitch = true;
      }
    }
  }

}

// int pointsUp, int multiplierUpLevel, int bonusAmount, int points, int
// bonusMultiplier