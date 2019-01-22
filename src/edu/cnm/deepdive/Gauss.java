package edu.cnm.deepdive;

public class Gauss {

  public static final int DEFAULT_UPPER_LIMIT = 100;

  public static void main(String[] args) {
    
    //TODO Read upper limit from args.
    int upperLimit = DEFAULT_UPPER_LIMIT;
    long sum = triangleSum(upperLimit);
    System.out.printf("Sum from 1 to %,d =%,d%n", upperLimit, sum);
  }

  public static long triangleSum(int upperLimit) {
    long sum = 0;
    for (int i=1; i <= upperLimit; i++){
      sum +=i;
    }
    return sum;
  }

}