package org.caeercup.chapter01.arraystring.p03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Transform {
  
  
  public static boolean canTransform(String s1, String s2){
    if(s1==null || s2==null || s1.equals("") || s2.equals("")){
      return false;
    }
    if(s1.length()!=s2.length()){
      return false;
    }
    int len = s1.length();
    Map<Character, Integer> map = new HashMap<>();
    char[] array1 = s1.toCharArray();
    char[] array2 = s2.toCharArray();
    for(int i=0;i <len ;i ++){
      char c = array1[0];
      if(map.containsKey(c)){
        map.put(c, 1);
      }else{
        map.put(c, map.get(c)+1);
      }
    }    
    for(int i=0;i <len ;i ++){
      char c = array2[0];
      if(!map.containsKey(c) && map.get(c).intValue()==0){
        return false;
      }else{
        map.put(c, map.get(c)-1);
      }
    }
    return true; 
  }
  
  
  
  public static boolean canTransform2(String s1, String s2){
    if(s1==null || s2==null || s1.equals("") || s2.equals("")){
      return false;
    }
    if(s1.length()!=s2.length()){
      return false;
    }
    int len = s1.length();
    Map<Character, Integer> map = new HashMap<>();
    char[] array1 = s1.toCharArray();
    char[] array2 = s2.toCharArray();
    Arrays.sort(array1);
    Arrays.sort(array2);
    for(int i=0;i <len ;i ++){
      if(array1[i]!=array2[i]){
        return false;
      }
    }    
    return true; 
  }

  public static void main(String[] args) { 

  }

}
