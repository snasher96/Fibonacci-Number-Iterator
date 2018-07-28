/*
Creator: Sheikh "Nash" Nasher
Date Created: November 15th, 2018
*/

// Excersie 24.13 from introduction to Java Programming (10th edition)

/*
Define an iterator class named FibonacciIterator
for iterating Fibonacci numbers. The constructor takes an argument that
specifies the limit of the maximum Fibonacci number. For example, new
FibonacciIterator(23302) creates an iterator that iterates Fibonacci numbers
less than or equal to 23302. Write a test program that uses this iterator to
display all Fibonacci numbers less than or equal to 100000.
*/

import java.util.Iterator;

public class Exercise13 {
  public static void main(String[] args) {
    Iterator<Integer> iterator = new FibonacciIterator(100000);
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
  
  static class FibonacciIterator implements java.util.Iterator<Integer> {
    private int limit;
    private int current = 1;//-1,1,0,1,1,2,3,5
    private int prev=-1;
    
    public FibonacciIterator(int limit) {
      this.limit = limit;
    }
    
    public Integer next() {
      return current;
    }    
     
    public boolean hasNext() {
  int temp=current;
  current=current+prev;//-1+1=0
  prev=temp;
      if (current >= limit)
        return false;
      else 
        return true;
    }
     
    public void remove() {
      throw new UnsupportedOperationException
        ("Method not supported");
    }
  }
}
