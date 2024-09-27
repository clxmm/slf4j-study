package org.clxmm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * @author clxmm
 * @Description
 * @create 2024-09-11 10:06
 */
public class SimpleLog {


    public static void main(String[] args) {
        MDC.put("userName", "clxmm");

        Logger logger = LoggerFactory.getLogger(SimpleLog.class);
        logger.info("Hello SimpleLog");

        MDC.clear();
    }
}
