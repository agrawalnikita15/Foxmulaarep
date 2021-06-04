import java.util.Arrays;
import java.util.Scanner;

public class Occurrence {
        public static void main(String[] args){
        System.out.println("Enter any 5 numbers.");
        Scanner sc=new Scanner(System.in);
        Integer[] ar=new Integer[5];
        for(int i=0;i<5;i++){
            ar[i]=sc.nextInt();
        }

        int count=0;
        System.out.println("Enter an element for the search:");
        int num=sc.nextInt();
        for (int no:ar){
            if(num==no){
                count++;
            }
        }
        System.out.println("The No. of occurences :: "+count);
        System.out.println("Array Before sorting");
        for(int i:ar){
            System.out.println(i);
        }
        System.out.println("Array After sorting");
        Arrays.sort(ar);
        for(int i:ar){
            System.out.println(i);
        }
    }
}