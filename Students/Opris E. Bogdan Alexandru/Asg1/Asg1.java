public class Asg1 {
  public static int sumMupltiple(int num, int limit) {
      int numOfMulitples = (limit - 1) / num;
      return num * (numOfMulitples * (numOfMulitples + 1) / 2);
  }

  public static void main(String[] args) {
    System.out.println(
        sumMupltiple(3, 1000) + sumMupltiple(5, 1000) - sumMupltiple(15, 1000));

  }
}