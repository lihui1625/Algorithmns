package org.caeercup.chapter01.arraystring.p07;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ClearArray {
  
  public static void clear(int[][] array){
    if(array==null || array.length==0 || array[0] ==null || array[0].length==0){
      return;
    }
    int m = array.length;
    int n = array[0].length;
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    for(int i=0 ; i<m ; i++){ 
      for(int j=0 ; j<n ; j++){ 
         if(array[i][j]==0){
           set1.add(i);
           set2.add(j);
         }
      }
    }
    for(Integer s: set1){
      for(int j=0 ; j<n ; j++){ 
        array[s][j]=0;
      }
    }
    for(Integer s: set2){
      for(int i=0 ; i<m ; i++){ 
        array[i][s]=0;
      }
    }
  }
  
  public static void print(int[][] array){
    if(array==null || array.length==0 || array[0] ==null || array[0].length==0){
      return;
    }
    int m = array.length; 
    int n = array[0].length;  
    for(int i=0 ; i<m ; i++){ 
      for(int j=0 ; j<n ; j++){ 
        System.out.print(array[i][j]+"  "); 
      }
      System.out.println(); 
    }
  }

  public static void main(String[] args) {
    Random r = new Random();
    int N = 5;
    int[][] array = new int[N][N]; 
    for(int i=0 ; i<N ; i++){ 
      for(int j=0 ; j<N ; j++){ 
        array[i][j] = r.nextInt(9)%9;
      }
    }
    print(array);
    System.out.println("---------------------------------------");
    clear(array);
    print(array);
  }

}
