package money;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    String currency() {
        return "CHF";
    }

    Money times(int multiplier){
        return new Franc(amount * multiplier);
    }
    
}
