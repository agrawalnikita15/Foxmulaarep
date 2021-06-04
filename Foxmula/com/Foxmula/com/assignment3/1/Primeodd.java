import java.util.Scanner;

public class Primeodd {

    public static void main(String[] args) throws CstmException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no.");
        int num = sc.nextInt();
        int count=0;
        for (int i=2;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        if (count>0){
            System.out.println("Not Odd and Prime");
        }else {
            System.out.println("Odd and prime");
            throw new CstmException("Exception occurs");           
        }

    }
}