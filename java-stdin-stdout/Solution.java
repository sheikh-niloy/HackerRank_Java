import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        //int scanning 
        Scanner scan1 = new Scanner(System.in);
        int i = scan1.nextInt();
        // double scanning 
        Scanner scan2 = new Scanner(System.in);
        double d = scan2.nextDouble();
        //String scanning 
        Scanner scan3 = new Scanner(System.in);
        String S = scan3.next();
        // Output
        System.out.println("String: " + S);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}