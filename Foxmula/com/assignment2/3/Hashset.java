import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> c = new HashSet<>();
        System.out.println("enter the length");
        int p = sc.nextInt();
        System.out.println("enter the character/string");
        for (int i =0; i <p; i++) {
            c.add(sc.next());
        }
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            System.out.println("The element present are "+it.next());
        }
    }
}