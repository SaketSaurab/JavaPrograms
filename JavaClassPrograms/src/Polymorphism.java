public class Polymorphism {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.calculate(2,3);
        calculator.calculate(2,3,4);
        calculator.calculate(1.0f,3);
    }
}
