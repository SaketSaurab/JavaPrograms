public class AbstractionExample {
    public static void main(String[] args) {
       //Abstraction is a process of hiding the implementation
       //details and showing only functionality to the user.
       //Ex.ATM
        MyCar myCar=new MyCar();
        myCar.vehicleSound();
        myCar.firstGear();
        myCar.secondGear();
        myCar.vehicleBreak();
        myCar.stop();

        MyBike  myBike=new MyBike();
        myBike.vehicleSound();

        myBike.firstGear();
        myBike.secondGear();
        myBike.vehicleBreak();
        myBike.stop();
    }
}
