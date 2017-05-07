package org.caeercup.chapter01.arraystring.p05;

import java.util.Random;
import java.util.UUID;

public class CompressString {

  public static String compressString(String org) {
    if (org == null || org.length() < 2) {
      return org;
    }
    char[] chars = org.toCharArray();
    char p = chars[0];
    int count = 1;
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < chars.length; i++) {
      if (chars[i] == p) {
        count++;
      } else {
        sb.append(p).append(count);
        p = chars[i];
        count = 1;
      }
      if (i == chars.length - 1) {
        sb.append(p).append(count);
      }
    }
    if (sb.length() >= org.length()) {
      return org;
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Random r = new Random();
    String s = UUID.randomUUID().toString();
    for (int i = 0; i < 5; i++) {
      int j = r.nextInt('H' - 'A');
      s += (char) ('A' + j);
      s += (char) ('A' + j);
    }
    s += 'A';
    System.out.println(s);
    System.out.println(compressString(s));
  }

}
