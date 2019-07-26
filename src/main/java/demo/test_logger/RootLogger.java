package demo.test_logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Level;

public class RootLogger {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("demo.test_logger");

        /*We retrieved the root logger using its statically defined name and set another levels.*/
        logger.debug("This logger massage is not logged, because root level is warn (debug < warn");
        ch.qos.logback.classic.Logger rootLogger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);

        rootLogger.setLevel(Level.INFO);

        logger.info("We can see this INFO message because we have changed a level");

        rootLogger.setLevel(Level.ERROR);

        rootLogger.warn("We can see this message!");
        logger.error("Only ERROR message can be logged now");





    }
}
