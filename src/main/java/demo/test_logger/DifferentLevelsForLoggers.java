package demo.test_logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DifferentLevelsForLoggers {

    public static void main(String[] args) {

        /*We can set the level for any logger*/
        Logger foobar = LoggerFactory.getLogger("com.building.foobar");
        Logger logger = LoggerFactory.getLogger("com.building.logback");
        Logger testLogger = LoggerFactory.getLogger("com.building.logback.tests");

        foobar.debug("This is DEBUG message from foobar");
        logger.debug("This is DEBUG message from logger (We can't see this)");
        logger.info("This is INFO message from logger");
        testLogger.info("This is INFO message from testLogger (We can't see this)");
        testLogger.error("This is ERROR from testLogger");
    }
}
