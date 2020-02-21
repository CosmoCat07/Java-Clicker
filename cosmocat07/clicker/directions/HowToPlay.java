package cosmocat07.clicker.directions;

import java.util.Scanner;
import cosmocat07.variables.MainVar;

public class HowToPlay {
  Scanner myObj = new Scanner(System.in);
  public void showRules1() {
    System.out.println("HOW TO PLAY JAVA CLICKER:\nPress Enter to Gain Points!!!\nUpgrade your points per click to gain more points at a time, and go for as many points as you can!!!\nAre you ready to play, or would you like to read more rules?\nEnter \"Ready\" to play, or hit enter to read more");
    switch (myObj.nextLine().toLowerCase()) {
      case "ready":
      MainVar.rulesKnown = true;
    }
  }
}