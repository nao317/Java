// Leftrightarrow

import java.util.Scanner;

public class abc345_a {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        String left = str.substring(0,1);
        String right = str.substring(str.length()-1, str.length());
        
        boolean result = true;

        if (left.equals("<") && right.equals(">")) {

            for (var i = 1; i < str.length()-1; i++) {

                String substr = str.substring(i,i+1);
                
                if (!substr.equals("=")) {
                    
                    result = false;
                    break;

                }
            }
        } else {

            result = false;
            
        }

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scan.close();

    }
}