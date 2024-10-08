package org.clxmm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author clxmm
 * @Description
 * @create 2024-08-30 09:01
 */
public class HelloWorld {


    private static final Logger log = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);

        int newT = 15;
        int oldT = 16;

        // using classical API
        logger.info("Hello World");

        // using fluent API
        logger.atInfo()
                .addArgument(newT)
                .addArgument(oldT)
                .log("newT {} has logged in with oldT {}");
    }


}
