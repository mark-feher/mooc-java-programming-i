
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros(), this.cents + addition.cents());
    }

    public boolean lessThan(Money compared) {
        if ((100 * euros + cents) < (100 *compared.euros() + compared.cents())) {
            return true;
        } else return false;
    }

    public Money minus(Money decreaser) {
        int newEuros = euros - decreaser.euros();
        int newCents = cents - decreaser.cents();

        if (newCents < 0) {
            newCents += 100;
            newEuros -= 1;
        }

        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }

        return new Money(newEuros, newCents);
    }
}
