package org.caeercup.chapter03.stackqueue.p03;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

import org.caeercup.chapter02.linklist.Node;
import org.caeercup.chapter03.stackqueue.p02.MinStack;

public class SetsOfStacks {

  private int stackMaxSize;
  private List<Stack> stacks;
  private int currentIndex;

  public SetsOfStacks(int stackMaxSize) {
    if (stackMaxSize < 0) {
      throw new java.lang.IllegalArgumentException(
          "stackMaxSize should be greater than 0");
    }
    this.stackMaxSize = stackMaxSize;
    stacks = new LinkedList<Stack>();
    currentIndex = 0;
  }

  public Object pop() {

    if ((stacks.size() <= currentIndex
        || stacks.get(currentIndex).isEmpty())) {
      if (currentIndex > 0) {
        currentIndex--;
      } else {
        throw new EmptyStackException();
      }
    }
    return stacks.get(currentIndex).pop();
  }

  public Object peek() {
    if ((stacks.size() <= currentIndex || stacks.get(currentIndex).isEmpty())
        && currentIndex > 0) {
      if (currentIndex > 0) {
        currentIndex--;
      } else {
        throw new EmptyStackException();
      }
    }
    return stacks.get(currentIndex).peek();
  }

  public Object push(Object item) {
    if (stacks.size() <= currentIndex) {
      stacks.add(new Stack());
    } else if (stacks.get(currentIndex).size() == stackMaxSize) {
      currentIndex++;
      if (stacks.size() <= currentIndex) {
        stacks.add(new Stack());
      }
    }
    return stacks.get(currentIndex).push(item);
  }

  public Integer size() {
    return this.stackMaxSize * (currentIndex)
        + (stacks.size() <= currentIndex ? 0
            : stacks.get(currentIndex).size());
  }

  public boolean isEmpty() {
    return (currentIndex == 0 && (stacks.size() <= currentIndex
        || stacks.get(currentIndex).isEmpty()));
  }

  @Override
  public String toString() {
    StringBuffer s = new StringBuffer();
    for (int i = 0; i < stacks.size(); i++) {
      s.append(stacks.get(i) + " ");
    }
    return s.toString();
  }

  public static void main(String[] args) {
    Random r = new Random();
    SetsOfStacks s = new SetsOfStacks(4);
    for (int i = 1; i < 60; i++) {
      s.push(r.nextInt(10));
      System.out.println(s);
      if (r.nextInt() % 2 == 0) {
        s.pop();
        System.out.println(s);
      }
    }
    while (!s.isEmpty()) {
      s.pop();
      System.out.println(s);
    }
  }

}
