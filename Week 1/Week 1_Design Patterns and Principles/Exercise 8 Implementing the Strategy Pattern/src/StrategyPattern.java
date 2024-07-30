
interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying Rupees" + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying Rupees" + amount + " using PayPal.");
    }
}

class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        paymentStrategy.pay(amount);
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "Koushik Dutta");
        PaymentStrategy payPalPayment = new PayPalPayment("koushikd2004@gmail.com");

        PaymentContext paymentContext = new PaymentContext(creditCardPayment);
        System.out.println("Making payment with Credit Card:");
        paymentContext.executePayment(150.0);

        System.out.println();

        paymentContext = new PaymentContext(payPalPayment);
        System.out.println("Making payment with PayPal:");
        paymentContext.executePayment(200.0);
    }
}
