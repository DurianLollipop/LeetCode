package cn.ysliu.leetcode.common;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _509_FibonacciNumberTest {

  private _509_FibonacciNumber fibonacciNumber = new _509_FibonacciNumber();

  @Test
  void fibByRecursion_1() {
    int result = fibonacciNumber.fibByRecursion(2);
    assertEquals(1, result);
  }

  @Test
  void fibByRecursion_2() {
    int result = fibonacciNumber.fibByRecursion(3);
    assertEquals(2, result);
  }

  @Test
  void fibByRecursion_3() {
    int result = fibonacciNumber.fibByRecursion(4);
    assertEquals(3, result);
  }

  @Test
  void fibByMemoRecursion_1() {
    int result = fibonacciNumber.fibByMemoRecursion(2);
    assertEquals(1, result);
  }

  @Test
  void fibByMemoRecursion_2() {
    int result = fibonacciNumber.fibByMemoRecursion(3);
    assertEquals(2, result);
  }

  @Test
  void fibByMemoRecursion_3() {
    int result = fibonacciNumber.fibByMemoRecursion(4);
    assertEquals(3, result);
  }

  @Test
  void fibByDynamicProgramming_1() {
    int result = fibonacciNumber.fibByDynamicProgramming(2);
    assertEquals(1, result);
  }

  @Test
  void fibByDynamicProgramming_2() {
    int result = fibonacciNumber.fibByDynamicProgramming(3);
    assertEquals(2, result);
  }

  @Test
  void fibByDynamicProgramming_3() {
    int result = fibonacciNumber.fibByDynamicProgramming(4);
    assertEquals(3, result);
  }

  @Test
  void fibByDynamicProgramming_StateCompression_1() {
    int result = fibonacciNumber.fibByDynamicProgramming_StateCompression(2);
    assertEquals(1, result);
  }

  @Test
  void fibByDynamicProgramming_StateCompression_2() {
    int result = fibonacciNumber.fibByDynamicProgramming_StateCompression(3);
    assertEquals(2, result);
  }

  @Test
  void fibByDynamicProgramming_StateCompression_3() {
    int result = fibonacciNumber.fibByDynamicProgramming_StateCompression(4);
    assertEquals(3, result);
  }
}