public class DeluxeBurger extends Burger {
    public DeluxeBurger(String type, double base_price) {
        super(type, base_price);
        max_extra_toppings = 5;
    }

    public double get_price() {
        return base_price;
    }

    public String toString() {
        return String.format("Burger: deluxe %s\t\t$%.2f", type,
                get_price());
    }
}
