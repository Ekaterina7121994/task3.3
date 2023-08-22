public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int cps = (int) service.calculate(1_000_000, 12, 9.99);
        System.out.println(cps);
        int cps2 = (int) service.calculate(1_000_000, 24, 9.99);
        System.out.println(cps2);
        int cps3 = (int) service.calculate(1_000_000, 36, 9.99);
        System.out.println(cps3);

    }
}