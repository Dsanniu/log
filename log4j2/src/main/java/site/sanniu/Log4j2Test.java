package site.sanniu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * @ClassName: Log4j2Test
 * @Description: TODO
 * @Author: sanniu
 * @Date: 2020/5/4 0004 19:28
 * @Version: 1.0
 */
public class Log4j2Test {

    public static final Logger logger = LogManager.getLogger(Log4j2Test.class);

    @Test
    public void test(){
        logger.fatal("fatal");
        logger.error("error");
        logger.warn("warn");
        logger.info("你好啊");
        logger.debug("debug");
        logger.trace("trace");
    }

}
