package cosmocat07.variables;
public class MainVar {

  public static int points = 0;
  public static int pointsUp = 1;
  public static int i = 4;
  public static int lifetimePoints = 0;
  public static int clicks = 0;
  public static double upgradeMultiplier = (int) Math.floor(Math.random() * 6) + 5;
  public static double upgradeCost = (int) Math.floor(pointsUp * upgradeMultiplier - points);
  public static double totalUpCost = (int) upgradeCost + points;
  public static int multiplierUpLevel = 20;
  public static int bonusMultiplier = 5;
  public static int bonusAmount = pointsUp * bonusMultiplier;
  public static double randomChance = Math.floor(Math.random() * pointsUp) + 1;
  public static boolean breakSwitch = false;
  public static int cheats = 0;
  public static long goal = 11;
  public static boolean gameEnd = false;
  public static int bonusTimeout = 0;
  public static boolean goalReady = false;
  public static boolean startReady = false;
  public static boolean rulesKnown = false;
}
