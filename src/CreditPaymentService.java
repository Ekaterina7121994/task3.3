public class CreditPaymentService {
    public double calculate(int a, int b, double c) {
        int loanAmount = a; //сумма кредита
        int numberOfMonths = b;  //  кол-во месяцев
        double e = c/12/100;
        double bet = c;   // % ставка в год
        double d = 1 + e;  // скобка
        int result = (int) (a * (e + (e / (Math.pow(d, b) - 1))));
        return result;
    }
}

