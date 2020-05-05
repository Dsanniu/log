package site.sanniu;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

    public static final Logger LOGGER = LoggerFactory.getLogger(SpringbootApplicationTests.class);

    @Test
    void contextLoads() {

        LOGGER.info("hahahha");
    }

}
