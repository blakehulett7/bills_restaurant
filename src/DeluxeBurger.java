public class DeluxeBurger extends Burger {
    public DeluxeBurger(String type, double base_price) {
        super(type, base_price);
    }

    public void add_topping() {
        int max_toppings = 5;
        if (extra_toppings < max_toppings) {
            extra_toppings++;
        }
    }

    public double get_price() {
        return base_price;
    }
}
