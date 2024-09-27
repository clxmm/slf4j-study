package org.clxmm;

import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;
import org.slf4j.spi.MDCAdapter;
import org.slf4j.spi.SLF4JServiceProvider;

/**
 * @author clxmm
 * @Description
 * @create 2024-09-24 15:03
 */
public class ClxmmServiceProvider implements SLF4JServiceProvider {

    private ILoggerFactory defaultLoggerContext;





    @Override
    public void initialize() {
        System.out.println("初始化方法");
        defaultLoggerContext = new LoggerContext();

    }


    @Override
    public ILoggerFactory getLoggerFactory() {
        return defaultLoggerContext;
    }

    @Override
    public IMarkerFactory getMarkerFactory() {
        return null;
    }

    @Override
    public MDCAdapter getMDCAdapter() {
        return null;
    }

    // 获取版本号
    @Override
    public String getRequestedApiVersion() {
        return "1.1.0";
    }


}
