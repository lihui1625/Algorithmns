package org.caeercup.chapter02.linklist.p03;

import java.util.Random;

import org.caeercup.chapter02.linklist.Node;
import org.caeercup.chapter02.linklist.NodeListUitl;

public class RemoveNode {
  
  public static void removeNode(Node n){
    if(n==null){
      return;
    }
    if(n.next ==null){
      throw new RuntimeException("can't remove");
    }
    n.value = n.next.value;
    n.next = n.next.next;
  }

  public static void main(String[] args) { 
    Node head = new Node(0);
    for(int i=1; i<20; i++){
      NodeListUitl.insertAfter(head, i);
    }
    NodeListUitl.print(head);
    Node p1 = head; 
    int cnt = 18;
    while(cnt>0){ 
      if(p1==null){
        return;
      }
      p1 = p1.next;
      cnt--;
    }
    System.out.println(p1);
    removeNode(p1);
    NodeListUitl.print(head);
  }

}
