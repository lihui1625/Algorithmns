package org.caeercup.chapter03.stackqueue.p05;

import java.util.Random;
import java.util.Stack;
 

public class MyQueue {

  private Stack<Object> stack1 = new Stack<>();
  private Stack<Object> stack2 = new Stack<>();

  public void enqeue(Object obj) {
    this.stack1.push(obj);
  }

  public Object deqeue() {
    if (this.stack2.isEmpty()) {
      while (!this.stack1.isEmpty()) {
        this.stack2.push(this.stack1.pop());
      }
    }
    return this.stack2.pop();
  }

  public Object peek() {
    if (this.stack2.isEmpty()) {
      while (!this.stack1.isEmpty()) {
        this.stack2.push(this.stack1.pop());
      }
    }
    return this.stack2.peek();
  }

  public boolean isEmpty() {
    return this.stack1.isEmpty() && this.stack2.isEmpty();

  }
  
  

  @Override
  public String toString() {
    return "MyQueue [stack1=" + stack1 + ", stack2=" + stack2 + "]";
  }

  public static void main(String[] args) {
    Random r = new Random();
    MyQueue s = new MyQueue();
    for (int i = 1; i < 40; i++) { 
      s.enqeue(i); 
      System.out.println(s);
      if (i % 3 == 0) {
        Object j  = s.deqeue();
        System.out.println(s + ", remove " + j);
      }
    }
    while (!s.isEmpty()) {
      Object j  = s.deqeue();
      System.out.println(s + ", remove " + j);
    }

  }
  
  

}
