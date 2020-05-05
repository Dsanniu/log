package site.sanniu;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: Slf4J
 * @Description: TODO
 * @Author: sanniu
 * @Date: 2020/5/3 0003 21:02
 * @Version: 1.0
 */
public class Slf4J {

    public static final Logger LOGGER = LoggerFactory.getLogger(Slf4J.class);

    @Test
    public void test(){
        LOGGER.error("错误");
        LOGGER.warn("警告");
        LOGGER.info("嘿嘿嘿");
        LOGGER.debug("DEBUG");
        LOGGER.trace("trace");

        // 使用占位符
        String name = "三牛";
        Integer age = 22;
        LOGGER.info("{} 你好啊 你今年{}",name,age);

        // 将系统异常信息 输出
        try{
            int i = 1/0;
        }catch (Exception e){
            //e.printStackTrace();
            LOGGER.error("报错啦",e);
        }
    }

}
