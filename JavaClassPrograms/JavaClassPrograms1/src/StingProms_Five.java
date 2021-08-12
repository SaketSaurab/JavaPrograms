public class StingProms_Five {

        public static void main(String[] args) {
            String st1 = "SPARTANS";
            String st2 = "SPARTANS";

            String st3 = new String("SPARTANS");
            String st4 = new String("SPARTANS").intern();

            System.out.println("String 1 " + st1.hashCode());
            System.out.println("String 2 " + st2.hashCode());
            System.out.println("String 3 " + st3.hashCode());
            System.out.println("String 4 " + st4.hashCode());
            System.out.println("<<<<<<<<<<<<<<<<<<||~~~|||>>>>>>>>>>>>>>>>>>");
            System.out.println(st1 == st2); //True
            System.out.println(st1 == st3); //False
            System.out.println(st2 == st3);  //False
            System.out.println(st1 == st4); //True
            System.out.println(st2 == st4); //True
            System.out.println(st3 == st4); //False

        }
    }



