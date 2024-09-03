package org.clxmm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author clxmm
 * @Description
 * @create 2024-08-30 09:01
 */
public class HelloWorld {


    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.info("Hello World");
        logger.atInfo().log("Hello World");


        int newT = 15;
        int oldT = 16;

        // using classical API
        logger.debug("oldT={} newT={} Temperature changed.", oldT, newT);

        // using fluent API
        logger.atDebug().setMessage("Temperature changed.").addKeyValue("oldT", oldT).addKeyValue("newT", newT).log();

    }


}
