package cosmocat07.clicker.cheats;
import java.util.Scanner;
import cosmocat07.variables.MainVar;

public class BonusTest extends MainVar {

  Scanner myObj = new Scanner(System.in);

  public void bonusTest() {
    System.out.println("Enter Password to Continue");
    switch (myObj.nextLine()) {
    case "cRcOCbS":
      if (pointsUp <= 10) {
        pointsUp = 10;
        System.out.println("Confirmed");
        cheats += 1;
      }
      break;
    case "carlPrimo":
      if (pointsUp <= 20) {
        pointsUp = 20;
        System.out.println("Confirmed");
        cheats += 1;
      }
      break;
    default:
      System.out.println("Password Incorrect");
      break;
    }
  }
}