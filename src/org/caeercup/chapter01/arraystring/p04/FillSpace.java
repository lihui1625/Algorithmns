package org.caeercup.chapter01.arraystring.p04;

public class FillSpace {
  
  public static char[] fillSpace(char[] org){
    if(org==null || org.length ==0){
      return org;
    }
    int newLen = 0;
    for(int i=0; i<org.length;i++){
      newLen++;
      if(org[i] == ' '){
        newLen+=2;
      }
    }
    char[] dest =  new char[newLen];
    for(int i=0 ,j=0; i<org.length;i++){
      if(org[i] == ' '){
        dest[j++] = '%';
        dest[j++] = '2';
        dest[j++] = '0';
      }else{
        dest[j++] = org[i];
      }
    } 
    return dest;
  }

  public static void main(String[] args) {
     System.out.println(new String(fillSpace(" %20%ads a  dc adsa ".toCharArray())));
  }

}
