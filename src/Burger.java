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

    public static Burger create_burger() {
        System.out.println("Which burger would you like?");
        System.out.println("1. regular");
        System.out.println("2. bbq");
        System.out.println("3. smash");
        String type_selection = Selector.get_selection(3);
        String chosen_type = switch (type_selection) {
            case "1" -> "regular";
            case "2" -> "bbq";
            case "3" -> "smash";
            default -> "";
        };

        System.out.println("Would you like to make it a deluxe?");
        System.out.println("1. yes");
        System.out.println("2. no");
        String deluxe_selection = Selector.get_selection(2);
        if (deluxe_selection == "1") {
            return new DeluxeBurger(chosen_type, 7);
        }

        return new Burger(chosen_type, 5);
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
