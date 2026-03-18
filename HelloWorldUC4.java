public class HelloWorldUC4 {
    public static void main(String[] args) {

        // If no arguments → default
        if (args.length == 0) {
            System.out.println("Hello World");
        } 
        // If multiple names → print all
        else {
            System.out.print("Hello ");

            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);

                // Add comma between names (except last)
                if (i < args.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}

