package site.sanniu;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: SpringBootTest
 * @Description: TODO
 * @Author: sanniu
 * @Date: 2020/5/4 0004 20:48
 * @Version: 1.0
 */
public class SpringBootTest {

    public static final Logger logger = LoggerFactory.getLogger(SpringBootTest.class);

    @Test
    public void test(){
        for(int i = 0 ;i< 10000;i++){
            logger.warn("警告");
            logger.info("嘿嘿嘿");
            logger.debug("DEBUG");
            logger.trace("trace");
        }
    }

}
