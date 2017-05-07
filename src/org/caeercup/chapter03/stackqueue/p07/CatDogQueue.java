package org.caeercup.chapter03.stackqueue.p07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import org.caeercup.chapter03.stackqueue.p03.SetsOfStacks;

public class CatDogQueue {

  private Queue<Dog> dogQueue = new LinkedList<>();
  private Queue<Cat> catQueue = new LinkedList<>();
  private int index = 0;

  public void enqeue(Animal obj) {
    if (obj instanceof Dog) {
      obj.index = ++index;
      dogQueue.add((Dog) obj);
    } else if (obj instanceof Cat) {
      obj.index = ++index;
      catQueue.add((Cat) obj);
    }
  }

  public Dog dequeueDog() {
    return dogQueue.poll();
  }

  public Cat dequeueCat() {
    return catQueue.poll();
  }

  public Animal dequeueAny() {
    if (dogQueue.isEmpty()) {
      return dequeueCat();
    }
    if (catQueue.isEmpty()) {
      return dequeueDog();
    }
    if (dogQueue.peek().index < catQueue.peek().index) {
      return dequeueDog();
    } else {
      return dequeueCat();
    }
  }

  @Override
  public String toString() {
    return "CatDogQueue [dogQueue=" + dogQueue + ", catQueue=" + catQueue + "]";
  }

  public boolean isEmpty() {
    return this.dogQueue.isEmpty() && this.catQueue.isEmpty();
  }

  private static abstract class Animal {
    protected String name;
    int index;

    public Animal(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return "Animal[" + name + "]";
    }

  }

  static class Dog extends Animal {

    public Dog(String name) {
      super(name);
    }

    @Override
    public String toString() {
      return "Dog[" + name + "]";
    }
  }

  static class Cat extends Animal {

    public Cat(String name) {
      super(name);
    }

    @Override
    public String toString() {
      return "Cat[" + name + "]";
    }

  }

  public static void main(String[] args) {

    Random r = new Random();
    CatDogQueue s = new CatDogQueue();
    for (int i = 1; i < 40; i++) {
      if (r.nextInt() % 2 == 0) {
        s.enqeue(new Cat(i + ""));
      } else {
        s.enqeue(new Dog(i + ""));
      }
      System.out.println(s);
    }
    while (!s.isEmpty()) {
      System.out.println(s.dequeueAny());
    }
  }

}
