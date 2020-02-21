package cosmocat07.clicker;

import cosmocat07.variables.MainVar;

class Upgrade extends MainVar {
  public void upgradePointsUp() {
    if (points >= upgradeMultiplier * pointsUp) {
      points -= upgradeMultiplier * pointsUp;
      pointsUp += 1;
      System.out.println("Congratulations! You now earn " + pointsUp + " points per click!");
      System.out.println("Your total points: " + points);
      upgradeMultiplier = Math.floor(Math.random() * 5) + 5;
      upgradeCost = Math.floor(pointsUp * upgradeMultiplier - points);
      totalUpCost = upgradeCost + points;
      if (upgradeCost > 0) {
        System.out.println("You need a total of " + totalUpCost + " points to upgrade again.");
      } else {
        System.out.println("You can upgrade again now.");
      }
    } else {
      System.out.println("You do not have enough points to do that. You need " + upgradeCost + " more points");
    }
  }
}