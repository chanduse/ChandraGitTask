import java.util.*;
class Build
{
  public static void main(String[] args) throws Exception
  {
    StringBuilder str = new StringBuilder("Chandra");
    System.out.println("String = "+str.toString());
    StringBuilder strrev = str.reverse();
    System.out.println("Reverse is = "+strrev.toString());

    str.appendCodePoint(44);
    System.out.println("Modified String = "+str);

    int capacity = str.capacity();
    System.out.println("StringBuilder is = "+str);
    System.out.println("Capacity of string is = "+ capacity);

  }
}
