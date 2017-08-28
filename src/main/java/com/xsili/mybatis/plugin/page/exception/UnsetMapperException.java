package com.xsili.mybatis.plugin.page.exception;

public class UnsetMapperException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UnsetMapperException() {
        super("没有在setMapper方法中指定Mapper对象");
    }

    public UnsetMapperException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsetMapperException(String message) {
        super(message);
    }

    public UnsetMapperException(Throwable cause) {
        super(cause);
    }

}
