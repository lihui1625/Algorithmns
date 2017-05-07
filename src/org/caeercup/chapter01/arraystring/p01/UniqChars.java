package org.caeercup.chapter01.arraystring.p01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniqChars {
  
  public static boolean isUniq(String s){
    if(s==null || s.equals("")){
      return false;
    }
    Set<Character> set = new HashSet<>();
    char[] chars = s.toCharArray();
    for(char c: chars){
      if(set.contains(c)){
        System.out.println(c);
        return false;
      }
      set.add(c);
    }
    return true; 
  }
  
  public static boolean isUniq2(String s){
    if(s==null || s.equals("")){
      return false;
    } 
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    for(int i=0 ; i < chars.length-1 ; i++){ 
        if(chars[i]==chars[i+1]){
          System.out.println(chars[i]);
          return false; 
      } 
    }
    return true; 
  }
  
  public static boolean isUniqForAscii(String s){
    if(s==null || s.equals("") || s.length()>256){
      return false;
    }
    char[] chars = s.toCharArray();
    int[] array = new int[256];
    for(char c: chars){
      int i = (int)c ;
      if(i<0 || i>255){
        throw new RuntimeException("not Asicc:" + c);
      }
       if(array[i]!=0){
         System.out.println(c);
         return false;
       }
       array[i] = 1;
    }
    return true; 
  }
  
  
  public static void main(String[] args){
    Random r = new Random();
    String s = "";
    for(int i=0; i<10; i++){
      int j = r.nextInt('z'-'0');
      s += (char)('0'+j);
    }
    System.out.println(s);
    System.out.println(isUniq(s));
    System.out.println(isUniq2(s));
    System.out.println(isUniqForAscii(s));
  }
  

}
