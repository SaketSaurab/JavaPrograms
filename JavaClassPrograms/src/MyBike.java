public class MyBike extends Vehicle implements MyInterface{
    @Override
    public void vehicleSound(){
        System.out.println("Broom");
    }
    @Override
    public void firstGear(){
        System.out.println("My bike is in 1st gear now");
    }

    @Override
    public void secondGear(){
        System.out.println("My bike is in 2nd gear now");
    }

    @Override
    public void vehicleBreak() {
        System.out.println("My bike is in brake now");
    }
}