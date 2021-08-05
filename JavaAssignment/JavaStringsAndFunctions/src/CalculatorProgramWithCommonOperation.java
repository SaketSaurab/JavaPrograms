import java.util.Scanner;

public class CalculatorProgramWithCommonOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        float one=sc.nextInt();
        float two=sc.nextInt();
        System.out.println("Select operation : + - * /");
        char op=sc.next().charAt(0);
        switch (op){
            case '+':
                System.out.println(one+"+"+two+"="+(one+two));
                break;
            case '-':
                System.out.println(one+"-"+two+"="+(one-two));
                break;
            case '*':
                System.out.println(one+"*"+two+"="+(one*two));
                break;
            case '/':
                System.out.println(one+"/"+two+"="+(one/two));
                break;
        }
    }
}
