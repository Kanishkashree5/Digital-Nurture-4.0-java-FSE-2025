// AdapterPatternDemo.java
public class AdapterPattern{
    public static void main(String[] args) {
        // Using PayPal through adapter
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPal());
        paypalProcessor.processPayment(100.0);

        // Using Stripe through adapter
        PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());
        stripeProcessor.processPayment(200.0);
    }
}
