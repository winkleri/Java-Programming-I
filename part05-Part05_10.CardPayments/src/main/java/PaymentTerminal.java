
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if(payment < 2.5) {
            return payment;
        } else {
            this.affordableMeals++;
            this.money += 2.5;
            return payment - 2.5;
        }
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment < 2.5) {
            return payment;
        } else {
            this.heartyMeals++;
            this.money += 4.3;
            return payment - 4.3;
        }
    }
    
    public boolean eatAffordably(PaymentCard card) {
            if(card.balance() - 2.5 >= 0) {
                card.takeMoney(2.5);
                this.affordableMeals++;
                return true;
            } else {
                return false;
            }
    }
    
    public boolean eatHeartily(PaymentCard card) {
            if(card.balance() - 4.3 >= 0) {
                card.takeMoney(4.3);
                this.heartyMeals++;
                return true;
            } else {
                return false;
            }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum > 0) {
        this.money += sum;
        card.addMoney(sum);
        } else {
            return;
        }
    }
    
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
