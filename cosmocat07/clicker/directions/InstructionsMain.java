package cosmocat07.clicker.directions;

import java.util.Scanner;

public class InstructionsMain {
  Scanner myObj = new Scanner(System.in);
  HowToPlay rules1 = new HowToPlay();
  public void showContents() {
  System.out.println("What would you like information on?");
  System.out.println("1. How to Play");
  System.out.println("2. Upgrading");
  System.out.println("3. Bonuses");
  System.out.println("4. Winning The Game");
  switch (myObj.nextInt()) {
    case 1:
    rules1.showRules1();
    break;
    case 2:
    //Upgrading Method
    break;
    case 3:
    //Bonuses Method
    break;
    case 4:
    //Winning The Game
    break;
  }
  }
}