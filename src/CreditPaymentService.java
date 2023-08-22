public class CreditPaymentService {
    public double calculate(int a, int b, double c) {
        int loanAmount = a; //сумма кредита
        int numberOfMonths = b;  //  кол-во месяцев
        double bet = c;   // % ставка в месяц
        double d = 1 + c;  // скобка
        int result = (int) (a * (c + (c / (Math.pow(d, b) - 1))));
        return result;
    }
}

