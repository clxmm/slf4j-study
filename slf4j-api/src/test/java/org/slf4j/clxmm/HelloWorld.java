package org.slf4j.clxmm;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author clxmm
 * @Description
 * @create 2024-08-29 20:27
 */
public class HelloWorld {


    @Test
    public void test1() {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.error("Hello World");
    }

}
