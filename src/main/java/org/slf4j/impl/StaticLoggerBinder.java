package org.slf4j.impl;

import love.forte.simplelogger.SimpleLoggerFactory;
import org.slf4j.ILoggerFactory;

/**
 *
 * slf4j static logger binder
 *
 * @author ForteScarlet <ForteScarlet@163.com>
 */
public class StaticLoggerBinder {
    private StaticLoggerBinder(){}
    private static final StaticLoggerBinder INSTANCE = new StaticLoggerBinder();
    public static StaticLoggerBinder getSingleton(){
        return INSTANCE;
    }
    public ILoggerFactory getLoggerFactory(){
        return SimpleLoggerFactory.getInstance();
    }

}
