public class Drink {

    private String type = "coke";
    private String size = "medium";
    private double price = 2.00;

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
}
