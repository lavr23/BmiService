public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(85, 1.85);
        double weight = 85;
        double height = 1.85;
        System.out.println("Your BMI for " + weight + "kg");
        System.out.println("and height " + height + "m");
        System.out.println("is " + bmi + ".");

    }
}
