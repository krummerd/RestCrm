
public class App {

    private Client client;

    private EventLogger eventLogger;

    public App(){

    }

    public App (Client client, EventLogger eventLogger) {

    }

    public static void main(String[] args) {
        App app = new App();

        app.logEvent("Some funny event!");
    }

    private void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }
}
