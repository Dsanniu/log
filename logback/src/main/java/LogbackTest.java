import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: LogbackTest
 * @Description: TODO
 * @Author: sanniu
 * @Date: 2020/5/4 0004 17:27
 * @Version: 1.0
 */
public class LogbackTest {

    // 日志记录器对象
    public static final Logger logger = LoggerFactory.getLogger(LogbackTest.class);

    @Test
    public void test(){
        logger.info("哈哈哈");
    }
}
