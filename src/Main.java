public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 3_880_000;
        double annualRatePercent = 9.2;
        int timeMonth = 360;

        int paymentАmount = (int) service.calculate(credit, annualRatePercent, timeMonth);
        System.out.println(paymentАmount);
    }
}