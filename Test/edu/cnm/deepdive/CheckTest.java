package edu.cnm.deepdive;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class CheckTest {

  @ParameterizedTest(name = "[{index}] input = {0}; expected = {1}")
  @CsvFileSource(resources = "test.csv")
  @DisplayName("Check sum of digits")
  
  void digitSum(int input, int expected) {

      int actual = Check.digitSum(input);
      assertEquals(expected, actual);
    }
  }



//  static final int[] INPUT = {
//      4046,
//      6325,
//      9788,
//      5676,
//      88,
//      8925,
//      8598,
//      2025,
//      4738,
//      453
//  };
//  static final int[] EXPECTED = {
//      14,
//      16,
//      32,
//      24,
//      16,
//      24,
//      30,
//      9,
//      22,
//      12
//  };
//
//  @Test
//  void digitSum() {
//    for (int i = 0; i < INPUT.length; i++) {
//      int input = INPUT[i];
//      int expected = EXPECTED[i];
//      int actual = Check.digitSum(input);
//      assertEquals(expected, actual);
//    }
//  }

//}
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//class CheckTest {
//
//  @Test
//  void main() {
//
//
//  }
//
//  @Test
//  void digitSum() {
//    assertEquals(4046, 14);
//    assertEquals(6325, 16);
//    assertEquals(9788, 32);
//    assertEquals(5676, 24);
//    assertEquals(88, 16);
//    assertEquals(8925, 24);
//    assertEquals(8598, 30);
//    assertEquals(2025, 9);
//    assertEquals(4738, 22);
//    assertEquals(453, 12;
//  }
//}