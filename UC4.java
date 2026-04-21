public class HelloApp {

    public static void main(String[] args) {

        String name;
        StringBuilder nameBuilder = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            nameBuilder.append(args[i]);

            if (i < args.length - 1) {
                nameBuilder.append(", ");
            }
        }

        name = nameBuilder.toString(); // Use the provided names

        System.out.println("Hello, " + name + "!");
    }
}