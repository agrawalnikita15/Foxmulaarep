import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Arraylistocc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> c = new ArrayList<>();
        System.out.println("enter the length");
        int p = sc.nextInt();
        System.out.println("enter the character/string");
        for (int i = 0; i < p; i++) {
            c.add(sc.next());
        }
        int count = 0;
        System.out.println("enter the string you want to check");
        String d = sc.next();
        System.out.println(c.contains(d));
      for (int i=0;i<c.size();i++){
          if (d.equals(c.get(i))){
                {
                    count++;

                }
            }

        }
        System.out.println("number of time it occures is:" + count);
    }
}
