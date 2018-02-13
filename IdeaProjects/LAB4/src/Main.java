import java.util.*;
import java.lang.String;
public class Main {
    //THIS IS AN UPDATE TO ESTABLISH A DIFFERENT VERSION
    Scanner scnr = new Scanner(System.in);
    String input = scnr.nextLine();

    public static void convert(String input) {
        long dec = 0;
        int c = 0;
        int length = input.length();
        int n = length;
        int nc = length - 1;
        int nc2 = length - 1;
        long answ = 0;
        long answ2 = 0;


        int[] array = new int[10];
        String hex = input.toUpperCase();
        if (hex.charAt(0) == '0' || hex.charAt(1) == 'X') {
            while (n > 2) {
                char num = hex.charAt(--n);
                if (num > 57) {
                    array[nc--] = num - 55;
                } else {
                    array[nc--] = num - 48;
                }
            }
        }
        else {
            while (n > 0) {
                char num = hex.charAt(--n);
                if (num > 57) {
                    array[nc--] = num - 55;
                } else {
                    array[nc--] = num - 48;
                }
            }
        }
        while(c<length) {
            dec = array[nc2--] * (long) Math.pow(16,c++);
            answ2 = answ2 + dec;
            answ = dec;
            dec = 0;
        }
        System.out.print("Your number is " + answ2 + " in decimal");
    }

    public static void main(String args []){
        System.out.print("Enter a hexadecimal number: ");
        Scanner scnr = new Scanner(System.in);
        String test = scnr.nextLine();
        convert (test);

    }
}
