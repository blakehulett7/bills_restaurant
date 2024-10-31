public class Main {
    public static void main(String[] args) {
        System.out.println("Christ is King!");

        var basic_meal = new MealOrder();

        System.out.println("\nWelcome to the meal constructor!");

        System.out.println("Which burger would you like?");
        System.out.println("1. regular");
        System.out.println("2. bbq");
        System.out.println("3. smash");
        String burger_selection = Selector.get_selection(3);

        System.out.println("What size?");
        System.out.println("1. small");
        System.out.println("2. medium");
        System.out.println("3. large");
        String burger_size_selection = Selector.get_selection(3);

        System.out.println("Any additional toppings? (Add up to 3)");
        String burger_toppings_selection = Selector.get_selection(3);
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
