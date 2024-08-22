public class CreditPaymentService {
    public double calculate(int credit, double annualRatePercent, int timeMonth) {
        double variable = (annualRatePercent / 12) / 100;
        double coefficient = (variable * Math.pow((variable + 1), timeMonth)) / (Math.pow((variable + 1), timeMonth) - 1);
        double paymentАmount = credit * coefficient;
        return (int) paymentАmount;
    }
}
