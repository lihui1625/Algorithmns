package org.caeercup.chapter03.stackqueue.p06;

import java.util.Random;
import java.util.Stack;

import org.caeercup.chapter03.stackqueue.p05.MyQueue;

public class MaxTopStack {

  private Stack<Integer> stack1 = new Stack<>();
  private Stack<Integer> stack2 = new Stack<>();

  public Integer pop() {
    return this.stack1.pop();
  }

  public Integer peek() {
    return this.stack1.peek();
  }

  public int size() {
    return this.stack1.size();
  }

  public boolean isEmpty() {
    return this.stack1.isEmpty();
  }

  public void push(Integer item) {
    while (!this.stack1.isEmpty() && this.stack1.peek() > item) {
      this.stack2.push(this.stack1.pop());
    }
    this.stack1.push(item);
    while (!this.stack2.isEmpty()) {
      this.stack1.push(this.stack2.pop());
    } 
  }
   

  @Override
  public String toString() {
    return "MaxTopStack [stack1=" + stack1 + ", stack2=" + stack2 + "]";
  }

  public static void main(String[] args) {
    MaxTopStack s = new MaxTopStack();
    Random r = new Random();
    for (int i = 1; i < 20; i++) { 
      s.push(r.nextInt(20)); 
      System.out.println(s);
    } 
    while (!s.isEmpty()) { 
      System.out.println(s.pop());
    }
  } 
}
