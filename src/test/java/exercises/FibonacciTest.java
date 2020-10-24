package exercises;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

  @Test
  public void fib() {
    Fibonacci fib = new Fibonacci();

    Assert.assertEquals(0, fib.fib(0));
    Assert.assertEquals(1, fib.fib(1));
    Assert.assertEquals(1, fib.fib(2));
    Assert.assertEquals(2, fib.fib(3));
    Assert.assertEquals(3, fib.fib(4));
  }
}