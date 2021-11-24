/*
Name: Karl
Date: 2021-11-24
Description: see README.md
*/

import java.util.*;

class Main {
  public static boolean isNumeric(String str) {
    if (str.length() > 0) {
      for (char c : str.toCharArray()) {
        if (!Character.isDigit(c)) {
          return false;
        }
      }
      return true;
    }
    return false;
  }

  public static String checkString(String str, int numSpaces) {
    if (numSpaces == str.length()) {
      boolean invalidChars = false;

      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) != 'C' && str.charAt(i) != '.') {
          invalidChars = true;
        }
      }

      if (invalidChars == true) {
        return "chars";
      } else {
        return "good";
      }
    }
    return "length";
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String scanStr;
    int numSpaces = 0;
    int occupiedSpaces = 0;
    String dayOneSpaces = "";
    String dayTwoSpaces = "";
    boolean isInputOk = false;

    while (isInputOk == false) {
      System.out.println("Please enter the number of spaces");
      scanStr = scan.nextLine();
      if (isNumeric(scanStr)) {
        numSpaces = Integer.valueOf(scanStr);
        isInputOk = true;
      }
    }
    isInputOk = false;

    while (isInputOk == false) {
      System.out.println("Enter a string containing what spaces were used on day 1");
      scanStr = scan.nextLine();

      if (checkString(scanStr, numSpaces) == "good") {
        dayOneSpaces = scanStr;
        isInputOk = true;
      } else if (checkString(scanStr, numSpaces) == "length") {
        System.out.println("Incorrect length");
      } else if (checkString(scanStr, numSpaces) == "chars") {
        System.out.println("Invalid characters. Only 'C' and '.' are allowed");
      }
    }
    isInputOk = false;

    while (isInputOk == false) {
      System.out.println("Enter a string containing what spaces were used on day 2");
      scanStr = scan.nextLine();

      if (checkString(scanStr, numSpaces) == "good") {
        dayTwoSpaces = scanStr;
        isInputOk = true;
      } else if (checkString(scanStr, numSpaces) == "length") {
        System.out.println("Incorrect length");
      } else if (checkString(scanStr, numSpaces) == "chars") {
        System.out.println("Invalid characters. Only 'C' and '.' are allowed");
      }
    }

    for (int i = 0; i < numSpaces; i++) {
      if (dayOneSpaces.charAt(i) == dayTwoSpaces.charAt(i) && dayOneSpaces.charAt(i) == 'C') {
        occupiedSpaces++;
      }
    }

    System.out.println("Answer: " + occupiedSpaces);

    scan.close();
  }
}