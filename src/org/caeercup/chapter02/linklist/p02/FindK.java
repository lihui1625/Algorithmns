package org.caeercup.chapter02.linklist.p02;

import java.util.Random;

import org.caeercup.chapter02.linklist.Node;
import org.caeercup.chapter02.linklist.NodeListUitl;

public class FindK {
  
  public static Node findk(Node head, int k){
    if(head==null){
      return null;
    }
    if(k<=0){
      return null;
    }
    if(k==1){
      Node p = head;
      while(p.next!=null){
        p = p.next;
      }
      return p;
    }
    Node p1 = head;
    Node p2 = head;
    int cnt = k;
    while(cnt>1){ 
      if(p1.next==null){
        return null;
      }
      p1 = p1.next;
      cnt--;
    }
    while(p1.next!=null){
      p1 = p1.next;
      p2 = p2.next;
    }
    return p2; 
  }

  public static void main(String[] args) {
    Node head = new Node(0);
    Random r = new Random();
    for(int i=1; i<10; i++){
      NodeListUitl.insertAfter(head, i);
    }
    NodeListUitl.print(head);
    System.out.println(findk(head, 0));
    System.out.println(findk(head, 1));
    System.out.println(findk(head, 2));
    System.out.println(findk(head, 3));
    System.out.println(findk(head, 5));
    System.out.println(findk(head, 6));

  }

}
