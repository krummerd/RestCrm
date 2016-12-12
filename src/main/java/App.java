import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.SocketPermission;

public class App {

    private Client client;

    private EventLogger eventLogger;

    public App(){

    }

    public App (Client client, EventLogger eventLogger) {

    }

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        App app = (App) context.getBean("app");

        app.logEvent("first event");
        app.logEvent("second event");

    }

    public void logEvent (String msg){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        eventLogger = (ConsoleEventLogger) context.getBean("ConsoleEventLogger");
        eventLogger.logEvent(msg);
    }
}
