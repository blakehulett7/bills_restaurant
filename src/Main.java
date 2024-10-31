public class Main {
    public static void main(String[] args) {
        System.out.println("Christ is King!");

        var basic_meal = new MealOrder();
        System.out.println(basic_meal);

        System.out.println("\nWelcome to the meal constructor!");

        var burger = Burger.create_burger();
        burger.add_toppings();
        System.out.println();

        var side = Side.create_side();
        System.out.println(side);
        System.out.println();

        var drink = Drink.create_drink();
        System.out.println(drink);
        System.out.println();

    }
}

class Selector {
    public static String get_selection(int options_length) {
        String possible_choices = "";
        for (int i = 1; i <= options_length; i++) {
            possible_choices += String.format("%s", i);
        }

        int tries = 0;
        int max_allowed_tries = 5;
        String selection = "";
        while (tries < max_allowed_tries) {
            selection = System.console().readLine("Enter your selection: ");
            if (!possible_choices.contains(selection)) {
                tries++;
                continue;
            }
            break;
        }

        if (tries == max_allowed_tries) {
            System.out.println("Error, too many incorrect selections!");
        }

        return selection;
    }
}
