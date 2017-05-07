package org.caeercup.chapter03.stackqueue.p02;

import java.util.Random;
import java.util.Stack;

import org.caeercup.chapter02.linklist.Node;
import org.caeercup.chapter02.linklist.NodeListUitl;

public class MinStack {

  private Stack<Integer> stack1 = new Stack<Integer>();
  private Stack<Integer> stack2 = new Stack<Integer>();

  public Integer pop() {
    if (!stack1.isEmpty() && !stack2.isEmpty()
        && stack1.peek() <= stack2.peek()) {
      stack2.pop();
    }
    return stack1.pop();
  }

  public Integer peek() {
    return stack1.peek();
  }

  public Integer push(Integer item) {
    if (stack2.isEmpty() || item <= stack2.peek()) {
      stack2.push(item);
    }
    return stack1.push(item);
  }

  public Integer size() {
    return stack1.size();
  }

  public boolean isEmpty() {
    return stack1.isEmpty();
  }

  public Integer min() {
    if (!stack2.isEmpty()) {
      return stack2.peek();
    }
    return Integer.MAX_VALUE;
  }

  @Override
  public String toString() {
    return "MinStack [stack1=" + stack1 + "]";
  }

  public static void main(String[] args) {
    Node head = new Node(0);
    Random r = new Random();
    MinStack s = new MinStack();
    for (int i = 1; i < 20; i++) {
      s.push(r.nextInt(10));
      System.out.println(s + ":" + s.min());
      if (r.nextInt() % 4 == 0) {
        s.pop();
        System.out.println(s + ":" + s.min());
      }
    }
    while (!s.isEmpty()) {
      s.pop();
      System.out.println(s + ":" + s.min());
    }
  }

}
