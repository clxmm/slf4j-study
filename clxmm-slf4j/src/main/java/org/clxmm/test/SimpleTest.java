package org.clxmm.test;

import org.slf4j.Logger;
import org.slf4j.spi.SLF4JServiceProvider;

import java.util.ServiceLoader;

/**
 * @author clxmm
 * @Description
 * @create 2024-09-24 16:40
 */
public class SimpleTest {

    private static Logger logger = org.slf4j.LoggerFactory.getLogger(SimpleTest.class);


    public static void main(String[] args) {
//        logger.info("hello world");

        ServiceLoader<SLF4JServiceProvider> load = ServiceLoader.load(SLF4JServiceProvider.class, SimpleTest.class.getClassLoader());


        for (SLF4JServiceProvider slf4jServiceProvider : load) {
            System.out.println(slf4jServiceProvider.toString());
        }




    }

}
