package site.sanniu;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.LogLog;
import org.junit.Test;

/**
 * @ClassName: Log4JTest
 * @Description: TODO
 * @Author: sanniu
 * @Date: 2020/5/4 0004 9:32
 * @Version: 1.0
 */
public class Log4JTest {

    /**
     * 入门案例
     */
    @Test
    public void test(){
        // 初始化配置 使用代码形式
        //BasicConfigurator.configure();
        // 使用配置文件会自动读取log4j.xml   log4j.properties文件进行加载日志

        Logger logger = Logger.getLogger(Log4JTest.class);
        logger.info("11111111111111");

        // 提供6个日志级别
        logger.fatal("严重错误，会导致系统奔溃");
        logger.error("错误信息，不影响系统运行");
        logger.warn("我是已警告");
        logger.info("运行信息，数据连接 IO 操作");
        logger.debug("调试开始");
        logger.trace("我是trace，追踪信息，记录程序所有的流程信息");
    }

    /**
     * 开启log4j内置的日志对象LogLog
     */
    @Test
    public void test1(){
        // 开启log4j内置的日志对象
        LogLog.setInternalDebugging(true);

        Logger logger = Logger.getLogger(Log4JTest.class);
        logger.info("11111111111111");

        // 提供6个日志级别
        logger.fatal("严重错误，会导致系统奔溃");
        logger.error("错误信息，不影响系统运行");
        logger.warn("我是已警告");
        logger.info("运行信息，数据连接 IO 操作");
        logger.debug("调试开始");
        logger.trace("我是trace，追踪信息，记录程序所有的流程信息");
    }

}
