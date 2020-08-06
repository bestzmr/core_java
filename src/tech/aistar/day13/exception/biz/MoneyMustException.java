package tech.aistar.day13.exception.biz;

/**
 * 本类用来演示:自定义异常,金额必须为正数
 *
 * @author: success
 * @date: 2020/8/6 4:12 下午
 */
public class MoneyMustException extends Exception{
    public MoneyMustException() {
    }

    public MoneyMustException(String message) {
        super(message);
    }

    public MoneyMustException(String message, Throwable cause) {
        super(message, cause);
    }

    public MoneyMustException(Throwable cause) {
        super(cause);
    }

    public MoneyMustException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
