package org.caeercup.chapter01.arraystring.p06;

import java.util.Arrays;
import java.util.Random;

public class RotateArray {
  
  public static void rotate(int[][] array){
    if(array==null || array.length==0 || array[0] ==null || array[0].length==0 
        ||array.length!=array[0].length){
      return;
    }
    int N = array.length;
    for(int i=0 ; i<N/2 ; i++){ 
      for(int j=i ; j<N-1-i ; j++){ 
        int tmp = array[i][j]; 
        array[i][j] = array[N-1-j][i];
        array[N-1-j][i] = array[N-1-i][N-1-j];
        array[N-1-i][N-1-j] = array[j][N-1-i];
        array[j][N-1-i] = tmp;
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
    int N = 4;
    int[][] array = new int[N][N]; 
    for(int i=0 ; i<N ; i++){ 
      for(int j=0 ; j<N ; j++){ 
        array[i][j] = (i+1)*10+(j+1);
      }
    }
    print(array);
    System.out.println("---------------------------------------");
    rotate(array);
    print(array);
  }

}
