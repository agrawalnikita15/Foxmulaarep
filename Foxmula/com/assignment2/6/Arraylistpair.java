import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> c = new ArrayList<>();
        System.out.println("enter the length");
        int p = sc.nextInt();
        System.out.println("enter the number");
        for (int i = 0; i < p; i++) {
            c.add(sc.nextInt());
        }
        System.out.println("Enter element's sum");
        int k = sc.nextInt();
        for (int i = 0; i < c.size(); i++) {
            for (int j = i + 1; j < c.size(); j++) {
                if (k == (c.get(i) + c.get(j))) {
                    System.out.println("The two pare are (" + c.get(i) + "," + c.get(j) + ")");
                }
            }

        }
    }
}