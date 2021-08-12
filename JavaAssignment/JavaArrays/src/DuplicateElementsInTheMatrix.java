import java.util.Scanner;

public class DuplicateElementsInTheMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        String []arr=new String[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (charA[i]==arr[j])

                {
                    count++;

                }
                System.out.println(arr[i]+" "+count);
            }
        }
    }
}
