package demo.test_logger;

import ch.qos.logback.classic.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewLogger {
    public static void main(String[] args) {

        ch.qos.logback.classic.Logger parentLogger =
                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.logback");

        parentLogger.setLevel(Level.INFO);

        Logger childLogger = LoggerFactory.getLogger("com.logback.test");

        /*We log two messages with each context to demonstrate the hierarchy.
        Logback logs the WARN, and INFO messages and filters the DEBUG messages.
         */
        parentLogger.warn("This message is logged because WARN > INFO.");
        parentLogger.debug("This message is not logged because DEBUG < INFO.");
        childLogger.info("INFO == INFO");
        childLogger.debug("DEBUG < INFO");

    }
}
