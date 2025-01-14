/*
Name: Karl
Date: 2025-01-14
Description: rewrote an early assignment for fun
*/

import java.util.Scanner;

public class Main {
  public static final Scanner SCANNER = new Scanner(System.in);

  public static void main(String[] args) {
    int len = Integer.parseInt(SCANNER.nextLine());
    char[] yesterdayPark = SCANNER.nextLine().toCharArray();
    char[] todayPark = SCANNER.nextLine().toCharArray();

    int count = 0;

    for (int i = 0; i < len; i++) {
      if (yesterdayPark[i] == 'C' && todayPark[i] == 'C') {
        count++;
      }
    }

    System.out.println(count);
  }
}