package demo.test_logger;

import ch.qos.logback.classic.Level;
import org.slf4j.LoggerFactory;

public class ParameterizedMessages {
    public static void main(String[] args) {

        /*The braces {} will accept any Object and uses its toString() method
        to build a message only after verifying that the log message is required.*/

        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("demo.test_logger");
        String message = "A process have started!";
        Integer number = 0;
        int divider = 30;

        logger.setLevel(Level.DEBUG);

        try {
            logger.debug("Logger message: {}", message);
            logger.info("We are going to divide {} by {}", number, divider);
            int dividing = number / divider;
            logger.warn("We have to divide {} by {}", 50, divider);
            int result = 50 / dividing;
        } catch (ArithmeticException ae) {
            logger.error("We had an arithmetic exception when dividing!", ae);
        }
    }
}
