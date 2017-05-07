package org.caeercup.chapter02.linklist;

public class NodeListUitl {
 

  public static Node insertAfter(Node head,int i) {
    if(head==null){
      head = new Node(i);
      return head;
    } 
    Node p = head;
    while(p.next!=null){
      p = p.next;
    }
    p.next = new Node(i);
    return head;
  }

  public static Node insertBefore(Node head,int i) {
    if(head==null){
      head = new Node(i);
      return head;
    } 
    Node p =  new Node(i);
    p.next = head;
    head = p;
    return head;
  }

  public static Node remove(Node head,int i) {
    if(head==null){
      return head;
    } 
    while(head!=null && head.value==i){
      Node preHead = head;
      head = head.next;
      preHead.next = null;
      preHead = null;
    }
    Node p = head;
    while(p!=null){
      Node pn = p.next;
      if(pn!=null && pn.value == i){
        p.next = pn.next;
        pn.next = null;
        pn = null;
      }
      p = p.next;
    } 
    return head;
  }
  
  public static void print(Node head){
    Node p = head;
    while(p!=null){
      System.out.print(p.value + (p.next==null?"":"->"));
      p = p.next;
    }
    System.out.println();
  }
}
