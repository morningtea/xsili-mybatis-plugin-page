package com.xsili.mybatis.plugin.page.exception;

/**
 * 调用Mapper类的方法时发生的异常
 */
public class InvokeMethodException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvokeMethodException() {
        super();
    }

    public InvokeMethodException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvokeMethodException(String message) {
        super(message);
    }

    public InvokeMethodException(Throwable cause) {
        super(cause);
    }

}
