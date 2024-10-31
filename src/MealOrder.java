public class MealOrder {

    private Burger burger;
    private Side side;
    private Drink drink;

    public MealOrder() {
        burger = new Burger();
        side = new Side();
        drink = new Drink();
    }

    public void add_another_topping() {
        if (burger.extra_toppings < burger.max_extra_toppings) {
            burger.extra_toppings++;
        }
    }

    public void change_drink(String type) {
        drink.type = type;
    }

    public String toString() {
        return burger.toString() + "\n" + side.toString() + "\n" + drink.toString() + "\n\t\t\t-----\n\t\t\t"
                + String.format("$%.2f", calculate_price());
    }

    private double calculate_price() {
        return burger.get_price() + side.price + drink.price;
    }
}
