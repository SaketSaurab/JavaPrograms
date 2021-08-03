public class Encapsulation {
    public static void main(String[] args) {
     MyData myData=new MyData();
        System.out.println("Before "+myData.getName());
myData.setNewName("Shivraj");
        System.out.println("Afer"+myData.getName());
    }
}
