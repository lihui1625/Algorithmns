package org.caeercup.chapter02.linklist;

public class Node {
  
  public int value;
  public Node next = null;
  
  public Node(int i){
    value = i;
  }

  @Override
  public String toString() {
    return "Node [value=" + value + "]";
  }
 
}

