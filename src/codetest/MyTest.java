package codetest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTest {

  public static void main(String[] args) {
    String s = "$value ";
    System.out.println(s.matches("^\\s*\\$(count|value|ref|links|)\\s*$"));
    s = " $count ";
    System.out.println(s.matches("^\\s*\\$(count|value|ref|links|)\\s*$"));
    s = " $ref ";
    System.out.println(s.matches("^\\s*\\$(count|value|ref|links|)\\s*$"));
    s = "$links ";
    System.out.println(s.matches("^\\s*\\$(count|value|ref|links|)\\s*$"));
    s = "$value ";
    System.out.println(s.matches("^\\s*\\$(count|value|ref|links|)\\s*$"));
    s = "value";
    System.out.println(s.matches("^\\s*\\$(count|value|ref|links|)\\s*$"));
    s = "$$value";
    System.out.println(s.matches("^\\s*\\$(count|value|ref|links|)\\s*$"));
    s = "$$value1";
    System.out.println(s.matches("^(?!(\\s*\\$(count|value|ref|links|)\\s*))$"));
    
    
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    System.out.println(format.format(new Date()));

  }

}
