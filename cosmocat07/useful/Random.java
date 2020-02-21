package cosmocat07.useful;

public class Random {
  public static int getRandomInteger(int min, int max) {
  int randomNum = (int) Math.floor(Math.random() * (max - min) ) + min;
  return randomNum;
}
}