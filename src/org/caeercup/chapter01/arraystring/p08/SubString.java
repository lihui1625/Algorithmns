package org.caeercup.chapter01.arraystring.p08;

public class SubString {

  public static boolean isSubString(String s1, String s2){
    if(s1==null||s2==null){
      return false;
    }
    return s1.contains(s2);
  }
  
  public static boolean isRotate(String s1, String s2){
    if(s1==null||s2==null || s1.length()!=s2.length()){
      return false;
    }
    if(s1.length()!=s2.length()){
      return false;
    }
    return  isSubString(s1+s1, s2);
  }
  
  public static void main(String[] args) {
    System.out.println(isRotate(" "," "));

  }

}
