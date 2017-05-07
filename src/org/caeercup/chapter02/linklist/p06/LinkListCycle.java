package org.caeercup.chapter02.linklist.p06;

import java.util.Random;

import org.caeercup.chapter02.linklist.Node;
import org.caeercup.chapter02.linklist.NodeListUitl;

public class LinkListCycle {
  
  public static boolean hasCycle(Node head){
    if(head==null || head.next==null){
      return false;
    }
    Node p1 = head;
    Node p2 = head.next;
    while(true){ 
      if(p1==null || p2==null || p2.next==null ){
        return false;
      }
      if(p1==p2){
        return true;
      }
      p1 = p1.next;
      p2 = p2.next.next;      
    } 
  }

  public static void main(String[] args) {
    Node head = new Node(0);
    Random r = new Random();
    for(int i=1; i<30; i++){
      NodeListUitl.insertAfter(head, r.nextInt(20));
    }
    NodeListUitl.print(head);
    System.out.println(hasCycle(head));
    Node p1 = head; 
    int cnt = 5;
    while(cnt>0){ 
      if(p1==null){
        return;
      }
      p1 = p1.next;
      cnt--;
    }
    p1.next = head; 
    System.out.println(hasCycle(head));
  }

}
