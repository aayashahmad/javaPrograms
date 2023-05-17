import java.util.Scanner;
public class CheckNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num=sc.nextInt();

        if(num>0){
            System.out.println("It is a positive number");
        } else if (num<0) {
            System.out.println("It is a negative number");

        }else {
            System.out.println("Neither positive nor negative");
        }

    }

}
