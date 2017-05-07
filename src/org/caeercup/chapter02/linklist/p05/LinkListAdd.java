package org.caeercup.chapter02.linklist.p05;

import java.util.Random;

import org.caeercup.chapter02.linklist.Node;
import org.caeercup.chapter02.linklist.NodeListUitl;

public class LinkListAdd {
  
  public static Node add(Node h1, Node h2){
    if(h1==null){
      return h2;
    }
    if(h2==null){
      return h1;
    }
    Node p1 = h1;
    Node p2 = h2;
    Node h3 = null;
    Node p3 = null;
    int more = 0;
    while(p1!=null || p2!=null || more>0){
       int v1 = p1==null? 0: p1.value ;
       int v2 = p2==null? 0: p2.value;
       int v = v1 + v2 + more;
       Node n = new Node(v%10);
       if(h3==null){
         h3 = n; 
       }
       else{
         p3.next = n;
       }
       p3 = n;
       more = v/10;
       p1 = p1!=null?p1.next:null;
       p2 = p2!=null?p2.next:null;
    }
    return h3;
  }
  
  public static Node reverseAdd(Node h1, Node h2){
    if(h1==null){
      return h2;
    }
    if(h2==null){
      return h1;
    }
    Node n = add(reverse( h1), reverse(h2));
    return reverse(n);
  }

  public static Node reverse(Node h){
    if(h==null || h.next==null){
      return h;
    }
    Node p1 = h;
    Node p2 = h.next;
    h.next = null;
    while(p2!=null){
      Node p2next = p2.next ;
      p2.next = p1;
      p1 = p2;
      p2 = p2next;
    }
    return p1;
  }
  
  public static void main(String[] args) {
    Node head = new Node(0);
    Random r = new Random();
    for(int i=1; i<10; i++){
      NodeListUitl.insertAfter(head, r.nextInt(9));
    }
    NodeListUitl.print(head);
    Node head2 = new Node(0); 
    for(int i=1; i<15; i++){
      NodeListUitl.insertAfter(head2, r.nextInt(9));
    }
    NodeListUitl.print(head2);
    
    NodeListUitl.print(add(head,head2));
    NodeListUitl.print(reverseAdd(head,head2));
  }

}
