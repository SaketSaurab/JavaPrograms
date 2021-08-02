public class StringProms_Three {
    public static void main(String[] args) {
        String st1="SPARTANS";
        String st2="SPARTANS";
        System.out.println("String 1 "+st1.hashCode());
        System.out.println("String 2 "+st2.hashCode());
        System.out.println("<<<<<<---------------->>>>>>>>");
        System.out.println(st1==st2);
        st1="SPARTANS 2";
        System.out.println(st1==st2);
        System.out.println("New hashCode "+st1.hashCode());
    }
}
