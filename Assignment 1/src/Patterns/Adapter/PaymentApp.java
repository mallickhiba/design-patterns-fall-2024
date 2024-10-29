package Patterns.Adapter;
public class PaymentApp {
    public static void main(String[] args) {
        PaymentGateway paypalGateway = new PaypalAdapter(new Paypal());
        PaymentGateway stripeGateway = new StripeAdapter(new Stripe());

        double amount = 100.0;
    paypalGateway.processPayment(amount);
stripeGateway.processPayment(amount);    }
    
}
