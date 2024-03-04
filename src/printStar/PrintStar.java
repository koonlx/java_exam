package printStar;

import java.util.Scanner;

public class PrintStar {
  public void printStar() {
    System.out.print("높이 입력 : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
