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
}
