package edu.cnm.deepdive;


public class Check {

  private static final String OUTPUT_FORMAT =
      "Input = %d; remainder = %d; digit sum = %d; remainder = %d.%n";
  private static final int MODULUS = 9;

  public static int digitSum(int input) {
    int sum = 0;
    String inStr = "" + input;
    for (char c : inStr.toCharArray()) {
      sum += c - '0';
    }
    return sum;
  }

  public static void main(String[] args) {
    int input = Integer.parseInt(args[0]);
    int sum = digitSum(input);
    System.out.printf(OUTPUT_FORMAT, input, input % MODULUS, sum, sum % MODULUS);
  }

}



//public class Check {
//
//  public static void main(String[] args) {
//    int val = 0 ;
//    digitSum(val);
//    System.out.print(val);
//  }
//
//  public static int digitSum(int param) {
//
//    String var = Integer.toString(param);
//
//    int param1 = 0;
//
//    for (int i = 0; i < var.length(); i++) {
//      char c = var.charAt(i);
//       param1 =param1 + Character.getNumericValue(c); }
//
//
//  return param1;
//}}