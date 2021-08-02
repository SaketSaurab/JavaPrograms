public class StingProms_Six_StringBufferBuilder {

        public static void main(String[] args) {
            //StringBuffer
            long startTime = System.currentTimeMillis();
            StringBuffer sb = new StringBuffer("MASAI");
            for (int i = 0; i < 10000; i++) {
                sb.append("SPARTANS");
            }
            System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

            //StringBuilder
            startTime = System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder("MASAI");
            for (int i = 0; i < 10000; i++) {
                sb2.append("SPARTANS");
            }
            System.out.println("Time  taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");

//        StringBuffer stringBuffer2 = new StringBuffer("SPARTANS");
//        StringBuffer stringBuffer3 = new StringBuffer("SPARTANS");
//        System.out.println(stringBuffer2 == stringBuffer3);
//        System.out.println(stringBuffer2.equals(stringBuffer3));

        }
    }

