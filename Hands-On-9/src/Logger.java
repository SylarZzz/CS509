public class Logger {
    private static Logger instance;

    private Logger() {  }

    public static Logger Instance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String level, String message) {
        switch (level) {
            case "Comment":
                System.out.println("Comment: " + message);
                break;
            case "Warning":
                System.out.println("\u001B[33mWarning: " + message + "\u001B[0m");
                break;
            case "Error":
                System.err.println("Error: " + message);
                System.exit(1);
                break;
            default:
                System.out.println(message);
        }
    }
}
