public class Burger {

    protected String type;
    protected double base_price;
    protected int extra_toppings;

    public Burger() {
        type = "regular";
        base_price = 5.00;
        extra_toppings = 0;
    }

    public Burger(String type, double base_price) {
        this.type = type;
        this.base_price = base_price;
    }

    public void add_topping() {
        int max_extra_toppings = 3;
        if (extra_toppings < max_extra_toppings) {
            extra_toppings++;
        }
    }

    public double get_price() {
        return base_price + extra_toppings * .5;
    }
}
