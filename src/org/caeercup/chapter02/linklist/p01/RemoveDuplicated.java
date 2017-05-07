package org.caeercup.chapter02.linklist.p01;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.caeercup.chapter02.linklist.Node;
import org.caeercup.chapter02.linklist.NodeListUitl;

public class RemoveDuplicated {
  
  public static void removeDuplicated(Node head){
    if(head==null || head.next==null){
      return ;
    }
    Set<Integer> set = new HashSet<>();
    set.add(head.value);
    
    Node pre = head ;     
    Node p = head.next;
    while(p!=null){
      int v = p.value ;
      if(set.contains(v)){
        pre.next = p.next ; 
      }
      else{
        set.add(v);
        pre = p;
      }  
      p = p.next;
    }
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    Random r = new Random();
    for(int i=0; i<10; i++){
      NodeListUitl.insertAfter(head, r.nextInt(8));
    }
    NodeListUitl.print(head);
    removeDuplicated(head);
    NodeListUitl.print(head);
  }

}
