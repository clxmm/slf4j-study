package org.clxmm;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author clxmm
 * @Description
 * @create 2024-09-24 17:21
 */
public class LoggerContext implements ILoggerFactory {


    ConcurrentMap<String, Logger> loggerMap;


    public LoggerContext() {
        loggerMap = new ConcurrentHashMap<String, Logger>();

    }

    @Override
    public Logger getLogger(String name) {
        if(name == null) {
            throw new IllegalArgumentException("name argument cannot be null");
        }


        return null;
    }
}
