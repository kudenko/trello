package junk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class TryLogger {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void loggerTest(){
        logger.info("asdasd");
    }
}
