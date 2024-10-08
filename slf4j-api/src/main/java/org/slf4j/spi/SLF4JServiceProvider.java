package org.slf4j.spi;

import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * This interface based on {@link java.util.ServiceLoader} paradigm. 
 * 
 * <p>It replaces the old static-binding mechanism used in SLF4J versions 1.0.x to 1.7.x.
 *
 * @author Ceki G&uml;lc&uml;
 * @since 1.8
 */
public interface SLF4JServiceProvider {

    /**
     * Return the instance of {@link ILoggerFactory} that 
     * {@link org.slf4j.LoggerFactory} class should bind to.
     * 
     * @return instance of {@link ILoggerFactory}
     *
     * <p>
     *     获取具体的ILoggerFactory 的实现类，由不同的日志提供商提供具体的实现
     * </p>
     */
    public ILoggerFactory getLoggerFactory();

    /**
     * Return the instance of {@link IMarkerFactory} that 
     * {@link org.slf4j.MarkerFactory} class should bind to.
     * 
     * @return instance of {@link IMarkerFactory} 
     */
    public IMarkerFactory getMarkerFactory();

    /**
     * Return the instance of {@link MDCAdapter} that
     * {@link MDC} should bind to.
     * 
     * @return instance of {@link MDCAdapter} 
     */
    public MDCAdapter getMDCAdapter();

    /**
     * Return the maximum API version for SLF4J that the logging
     * implementation supports.
     *
     * <p>For example: {@code "2.0.1"}.
     *
     * @return the string API version.
     *
     * <br/>
     * 返回日志记录实现支持的SLF4J的最大API版本。
     */
    public String getRequestedApiVersion();

    /**
     * Initialize the logging back-end.
     * 
     * <p><b>WARNING:</b> This method is intended to be called once by 
     * {@link LoggerFactory} class and from nowhere else. 
     *
     *
     * <p>
     *     SLF4JServiceProvider 初始化回调方法，
     * </p>
     */
    public void initialize();
}
