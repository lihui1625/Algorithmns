package org.caeercup.chapter02.linklist.p07;

import java.util.Random;
import java.util.Stack;

import org.caeercup.chapter02.linklist.Node;
import org.caeercup.chapter02.linklist.NodeListUitl;

public class PalindromeLinkNode {
  
  
  public static boolean isPalindrome(Node head){
    if(head==null){
      return false;
    }
    if(head.next==null){
      return true;
    }
    int len = 0;
    Node p = head;
    while(p!=null){
      len++;
      p = p.next;
    }
    int leftEnd = len/2;
    int rightStart = (len%2==0)?(leftEnd+1):(leftEnd+2);
    int index = 0;
    p = head;
    Stack<Integer> s = new Stack<Integer>();
    while(p!=null){
      index++;
      if(index<=leftEnd){
        s.push(p.value);
      }
      else if(index>=rightStart){
        int tmp = s.pop();
        if(tmp!=p.value){
          return false;
        } 
      }
      p = p.next;
    }
    return true;
  }

  public static void main(String[] args) {
    Node head = new Node(0); 
    for(int i=1; i<10; i++){
      NodeListUitl.insertAfter(head, i);
    }
    NodeListUitl.print(head);
    System.out.println(isPalindrome(head));
    for(int i=10; i>=0; i--){
      NodeListUitl.insertAfter(head, i);
    }
    NodeListUitl.print(head);
    System.out.println(isPalindrome(head));
    head = new Node(0); 
    for(int i=1; i<10; i++){
      NodeListUitl.insertAfter(head, i);
    }
    NodeListUitl.print(head);
    System.out.println(isPalindrome(head));
    for(int i=9; i>=0; i--){
      NodeListUitl.insertAfter(head, i);
    }
    NodeListUitl.print(head);
    System.out.println(isPalindrome(head));
  }

}
