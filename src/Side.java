public class Side {

    private String type;
    protected double price;

    // I could probably abstract the actual menu creation itself in the future
    public static Side create_side() {
        System.out.println("What side would you like?");
        System.out.println("1. fries");
        System.out.println("2. mozzarella sticks");
        System.out.println("3. tater tots");
        var selection = Selector.get_selection(3);
        var input = switch (selection) {
            case "1" -> "fries";
            case "2" -> "mozzarella sticks";
            case "3" -> "tater tots";
            default -> "";
        };

        return new Side(input);
    }

    public Side() {
        type = "fries";
        price = 3.00;
    }

    public Side(String type) {
        this.type = type;
        this.price = switch (type) {
            case "fries" -> 3.00;
            case "mozzarella sticks" -> 4.00;
            case "tater tots" -> 2.00;
            default -> -1.00;
        };
        if (price < 0) {
            System.out.println("Error, price cannot be negative!");
        }
    }

    public String toString() {
        return String.format("Side: %s\t\t$%.2f", type, price);
    }
}
