public class DeluxeBurger extends Burger {
    public DeluxeBurger(String type, double base_price) {
        super(type, base_price);
        max_extra_toppings = 5;
    }

    public double get_price() {
        return base_price;
    }
}
