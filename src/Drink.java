public class Drink {

    protected String type;
    private String size;
    private double price;

    public static Drink create_drink() {
        System.out.println("What kind of drink would you like?");
        System.out.println("1. coke");
        System.out.println("2. dr pepper");
        System.out.println("3. sweet tea");
        System.out.println("4. water");
        var type_selection = Selector.get_selection(4);
        var input_type = switch (type_selection) {
            case "1" -> "coke";
            case "2" -> "dr pepper";
            case "3" -> "sweet tea";
            case "4" -> "water";
            default -> "";
        };

        System.out.println("What size");
        System.out.println("1. small");
        System.out.println("2. medium");
        System.out.println("3. large");
        var size_selection = Selector.get_selection(3);
        var input_size = switch (type_selection) {
            case "1" -> "small";
            case "2" -> "medium";
            case "3" -> "large";
            default -> "";
        };

        return new Drink(input_type, input_size);
    }

    public Drink() {
        type = "coke";
        size = "medium";
        price = 2.00;
    }

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        price = switch (size) {
            case "small" -> 1.00;
            case "medium" -> 2.00;
            case "large" -> 3.00;
            default -> -1.00;
        };

        if (price < 0) {
            System.out.println("Error!!!, unsupported drink size");
        }
    }

    public String toString() {
        return String.format("I am a %s %s that costs $%.2f", size, type, price);
    }
}
