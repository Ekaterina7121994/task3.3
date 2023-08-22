public class CreditPaymentService {
    public double calculate(int credit, int term, double annualRate) {
        double ratePerMonth = annualRate/12/100;
        double bracket = 1 + ratePerMonth;
        int result = (int) (credit * (ratePerMonth + (ratePerMonth / (Math.pow(bracket, term) - 1))));
        return result;
    }
}

