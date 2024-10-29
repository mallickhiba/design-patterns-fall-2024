package Patterns.Adapter;
public class StripeAdapter implements PaymentGateway {
    private Stripe stripe;
    
    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }
    
    @Override
    public void processPayment(double amount) {
        stripe.charge(amount);
    }
    
}
