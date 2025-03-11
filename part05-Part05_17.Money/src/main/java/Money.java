
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

    public Money plus(Money addition) {
        int euros1 = addition.euros();
        int cents1 = addition.cents();
        int euros2 = this.euros();
        int cents2 = this.cents();
        
        int addedEuros = euros1 + euros2;
        int addedCents = cents1 + cents2;
        
        Money newMoney = new Money(addedEuros, addedCents);
        
        
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        int comparedEuros = compared.euros();
        int comparedCents = compared.cents();

        if (comparedEuros != this.euros) {
            return this.euros < comparedEuros;
        } else {
            return this.cents < comparedCents;
        }
    }

    public Money minus(Money decreaser) {
        int euros = decreaser.euros();
        int cents = decreaser.cents();
        int euros2 = this.euros();
        int cents2 = this.cents();
        
        
        int subtractedCents = cents2 - cents;
        int subtractedEuros = euros2 - euros;
        
        if(subtractedCents < 0) {
            subtractedEuros--;
            subtractedCents += 100;
        }    
        if(subtractedEuros < 0) {
            subtractedEuros = 0;
            subtractedCents = 0;
        }
        Money newMoney = new Money(subtractedEuros, subtractedCents);

        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
