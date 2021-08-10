import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class HDFC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Selection one option :");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Show Balance");
        System.out.println("4.Show Account Details");
        int a=sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Enter the amount to be deposit:");
                int deposit=sc.nextInt();
                System.out.println(deposit+" deposited in your account");
                break;
            case 2:
                System.out.println("Enter the amount to withdraw:");
                int withdraw=sc.nextInt();
                System.out.println(withdraw+" amount withdraw from your account");
                break;
            case 3:
                System.out.println("You have 4590 rupees in your account");
                break;
            case 4:
                System.out.println("Account details:");
                System.out.println("Name: Saket Saurabh");
                System.out.println("Balance: 4590");
                System.out.println("Address: Prayagraj, Uttar Pradesh" );


        }
    }
}
