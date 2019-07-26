package demo.guide_to_logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {

        LOGGER.info("Test logger started to work!");
        try {
            LOGGER.warn("Attention! The program makes the separation!");
            int a = 20;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            LOGGER.error("An error has occurred in the program!");
        }

    }
}
