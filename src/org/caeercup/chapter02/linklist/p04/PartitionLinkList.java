package org.caeercup.chapter02.linklist.p04;

import java.util.Random;

import org.caeercup.chapter02.linklist.Node;
import org.caeercup.chapter02.linklist.NodeListUitl;

public class PartitionLinkList {
  
  public static Node partion(Node head, int value){
    if(head==null || head.next==null){
      return head;
    }
    Node smallHead = null;
    Node bigHead = null;
    Node p = head;
    Node smallP = smallHead;
    Node bigP = bigHead;
    while(p!=null){
      if(p.value<value){
        if(smallP==null){
          smallHead = p;
        }
        else{
          smallP.next = p;
        }
        smallP = p;
      }
      else{
        if(bigP==null){
          bigHead = p;
        }
        else{
          bigP.next = p;
        }
        bigP = p;
      }
      p = p.next;
    }
    if(smallP!=null){ 
      smallP.next = null;
    }
    if(bigP!=null){ 
      bigP.next = null;
    }
    if(smallHead==null){
      head = bigHead;
      return bigHead;
    }
    else{
      smallP.next = bigHead;
      head = smallHead;
      return smallHead;
    }
  }

  public static void main(String[] args) { 
    Node head = new Node(0);
    Random r = new Random();
    for(int i=1; i<30; i++){
      NodeListUitl.insertAfter(head, r.nextInt(20));
    }
    NodeListUitl.print(head);
    partion(head, 10);
    NodeListUitl.print(head);
  }

}
