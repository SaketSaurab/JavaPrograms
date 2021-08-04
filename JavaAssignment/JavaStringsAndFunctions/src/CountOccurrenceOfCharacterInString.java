import java.util.Scanner;

public class CountOccurrenceOfCharacterInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            System.out.print("Occurrence of "+c+" = ");
            System.out.println(Occurrence(str,c));
        }

    }
        public static int Occurrence(String str, char c){
            char arr[]=new char[str.length()];
            int count=0;
            for (int j=0;j<str.length();j++){
                arr[j]=str.charAt(j);
                if (arr[j]==c){
                    count++;
                }
            }
            return count;
        }
    }

