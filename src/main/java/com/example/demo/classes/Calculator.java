package com.example.demo.classes;

public class Calculator {

  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    return a / b;
  }

  public long factorial(int a) {
    long result = 1;
    for (int factor = 2; factor <= a; factor++) {
      result *= factor;
    }
    return result;
  }

}
