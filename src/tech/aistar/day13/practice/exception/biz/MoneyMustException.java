package tech.aistar.day13.practice.exception.biz;

/**
 * @author: Merlin
 * @time: 2020/8/6 21:16
 */
public class MoneyMustException extends Exception {
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

    public MoneyMustException(String message, Throwable cause, boolean enableSuppression, boolean writeableStackTrace) {
        super(message, cause, enableSuppression, writeableStackTrace);
    }
}
