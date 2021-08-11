import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        rectangle.Area(a,b);
        rectangle.perimeter(a,b);
        Square square=new Square();
        System.out.println();
        System.out.println("Enter the length and breadth of the Square");
        int c=sc.nextInt();
        int d=sc.nextInt();
        square.Area(c,d);
        square.Perimeter(c,d);

    }
}
