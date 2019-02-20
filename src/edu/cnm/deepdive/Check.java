package edu.cnm.deepdive;

public class Check {

  public static void main(String[] args) {
    int val =0 ;
    digitSum(val);
    System.out.print(val);
  }

  public static int digitSum(int param) {

    String var = Integer.toString(param);

    int param1 = 0;

    for (int i = 0; i < var.length(); i++) {
      char c = var.charAt(i);
       param1 =param1 + Character.getNumericValue(c); }


  return param1;
}}