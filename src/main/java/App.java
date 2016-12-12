
public class App {

    private Client client;
    private ConsoleEventLogger eventLogger;

    public static void main(String[] args) {
        App app = new App();

        app.client = new Client ("1", "John Came");
        app.eventLogger = new ConsoleEventLogger();

        app.logEvent("Some funny event!");
    }

    private void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }
}
