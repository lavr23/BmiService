public class BmiService {
    public double calculate (double weight, double height) {

        weight = 85;
        height = 1.85;
        double bmi = (weight / (height * height));

        return bmi;
    }
}
