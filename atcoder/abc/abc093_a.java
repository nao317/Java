/* abc of ABC */

import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class abc093_a {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<String> list = new ArrayList<>();
    String string = scan.next();
    list.add(string.substring(0,1));
    list.add(string.substring(1,2));
    list.add(string.substring(2,3));
    Collections.sort(list);
    String result = String.join("", list);
    if (result.equals("abc")) {
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }
    scan.close();
  }
}