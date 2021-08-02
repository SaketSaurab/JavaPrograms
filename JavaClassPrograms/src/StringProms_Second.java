public class StringProms_Second {
    public static void main(String[] args) {
        String s1="Spartans";
        String s2="Spartans";
        String s3=new String("Spartans");
        System.out.println("String 1 "+s1.hashCode());
        System.out.println("String 2 "+s2.hashCode());
        System.out.println("String 3 "+s3.hashCode());
        System.out.println("<<<<<<<--------->>>>>>>>");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
    }
}
