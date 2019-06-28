package demo.test_logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

import static org.slf4j.event.Level.*;

public class NewLogger {


    public static void main(String[] args) {

        /*ch.qos.logback.classic.Logger parentLogger =
                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("guide_to_logback");

        //parentLogger.setLevel(ch.qos.logback.classic.Level.INFO);

        Logger childlogger =
                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("test_logger");

        parentLogger.warn("This message is logged because WARN > INFO.");
        parentLogger.debug("This message is not logged because DEBUG < INFO.");
        childlogger.info("INFO == INFO");
        childlogger.debug("DEBUG < INFO");*/


        Logger foobar =
                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.baeldung.foobar");
        Logger logger =
                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.baeldung.logback");
        Logger testslogger =
                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.baeldung.logback.tests");

        foobar.debug("This is logged from foobar");
        logger.debug("This is not logged from logger");
        logger.info("This is logged from logger");
        testslogger.info("This is not logged from tests");
        testslogger.warn("This is logged from tests");
    }
}
