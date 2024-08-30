
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.00;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        double affordableMeal = 2.50;
        if (payment >= affordableMeal) {
            this.money += affordableMeal;
            this.affordableMeals++;

            return payment - affordableMeal;

        }
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        double affordableMeal = 2.50;
        if (card.takeMoney(affordableMeal)) {
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }

    }

    public double eatHeartily(double payment) {
        double heartyMeal = 4.30;
        if (payment >= heartyMeal) {
            this.money += heartyMeal;
            this.heartyMeals++;
            return payment - heartyMeal;
        }
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment;
    }

    public boolean eatHeartily(PaymentCard card) {
        double heartyMeal = 4.30;
        if (card.takeMoney(heartyMeal)) {  //has if statement in takeMoney method.
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum){
        if (sum > 0) { // in order to not add a negative
            card.addMoney(sum);
            this.money +=sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
