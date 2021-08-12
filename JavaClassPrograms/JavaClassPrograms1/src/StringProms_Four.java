public class StringProms_Four {
    public static void main(String[] args) {
        String st1="SPARTANS";
        String st2="SPARTANS";
        System.out.println("String 1 "+st1.hashCode());
        System.out.println("String 2 "+st2.hashCode());
        System.out.println("<<<<<<<____________>>>>>>>>");
        System.out.println(st1==st2);
        st1="SPARTAN 2";
        System.out.println(st1==st2);
        System.out.println("String 2 new HashCode "+st1.hashCode());
        System.out.println("<<<<<<<____________>>>>>>>>");
        String st3="SPARTANS";
        System.out.println(st1==st3);
        System.out.println(st2==st3);
        System.out.println("String 3 "+st3.hashCode());
    }
}
