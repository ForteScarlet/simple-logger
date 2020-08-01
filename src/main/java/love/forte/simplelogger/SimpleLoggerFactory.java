package love.forte.simplelogger;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/**
 * {@link ILoggerFactory}日志工厂实现类
 * @author ForteScarlet <ForteScarlet@163.com>
 * 2020/8/1
 */
public class SimpleLoggerFactory implements ILoggerFactory {
    private SimpleLoggerFactory(){}
    private static final SimpleLoggerFactory INSTANCE = new SimpleLoggerFactory();

    public static SimpleLoggerFactory getInstance() {
        return INSTANCE;
    }

    public Logger getLogger(String name) {
        // TODO
        return new SimpleLogger();
    }
}
