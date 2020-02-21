package cosmocat07.clicker;
import java.util.Scanner;
import cosmocat07.variables.MainVar;
import java.util.InputMismatchException;

public class Goal extends MainVar {

  Scanner myObj = new Scanner(System.in);

  public void setGoal() {
    while (goalReady == false) {
      goalReady = true;
      try {
        System.out.println("Enter your objective amount of points.");
        System.out.println("Whole numbers only please!!!");
        goal = Long.parseLong(myObj.nextLine());
        if (goal <= 10) {
          throw new ArithmeticException("Test");
        }
      } catch (InputMismatchException | NumberFormatException e) {
        System.out.println("Please Enter A Number. Tip: Don't Spell the Number");
        goalReady = false;
      } catch (ArithmeticException a) {
        System.out.println("Please Enter a Number Greater than 10");
        goalReady = false;
      }
    }
  }
}