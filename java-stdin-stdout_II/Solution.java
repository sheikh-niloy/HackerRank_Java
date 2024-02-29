import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        //int scanning 
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        // double scanning 
        // Scanner scan2 = new Scanner(System.in);
        double d = scan.nextDouble();
        scan.nextLine();
        //String scanning 
        // Scanner scan3 = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        // Output
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
