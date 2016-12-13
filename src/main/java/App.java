import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.SocketPermission;

public class App {

    private Client client;

    private EventLogger eventLogger;

    public App (Client client, EventLogger eventLogger) {
        super();
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        App app = (App) context.getBean("app");

        app.logEvent("first event");
        app.logEvent("second event");

    }

    public void logEvent (String msg){
        String message = msg.replaceAll(client.getId(), client.getFullName());
        //eventLogger.logEvent(message);
    }
}
