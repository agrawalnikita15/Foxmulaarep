import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> num = new HashSet<>();
        System.out.println("enter the length");
        int p = sc.nextInt();
        System.out.println("enter the number");
        for (int i =0; i <p; i++) {
            num.add(sc.nextInt());
        }
        System.out.println("Enter the number to search");
        int q = sc.nextInt();
        if (num.contains(q)) {
            System.out.println("number is present");
        } else {
            System.out.println("Does not contain number");
        }
    }
}