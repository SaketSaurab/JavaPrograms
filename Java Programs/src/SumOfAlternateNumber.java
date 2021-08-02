import java.util.Scanner;

public class SumOfAlternateNumber {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

    }System.out.print("Entered numbers are: ");
        for (int i=0;i<n;i++){

        System.out.print(arr[i]+" ");
}

        for (int i=0;i<n;i+=2) {
            sum = sum + arr[i];



        }
        System.out.println();
        System.out.print("The sum of alternate number is = "+sum);
    }}