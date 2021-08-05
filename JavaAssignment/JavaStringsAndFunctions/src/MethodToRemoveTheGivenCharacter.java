import java.util.Scanner;
//Write a method that will remove the given character from the String
public class MethodToRemoveTheGivenCharacter {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String text=str.nextLine();
        String word=str.next();
        System.out.println("Before -> "+text);
        String after=text.replace(word,"");
        System.out.println("After -> "+after);
    }
}
