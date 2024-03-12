public class StaticLogger {

    public static void log(String level, String message) {

        switch (level) {
            case "Comment" -> System.out.println("Comment: " + message);
            case "Warning" -> System.out.println("\u001B[33mWarning: " + message + "\u001B[0m");
            case "Error" -> {
                System.err.println("Error: " + message);
                System.exit(1);
            }
            default -> System.out.println(message);
        }
    }
}
