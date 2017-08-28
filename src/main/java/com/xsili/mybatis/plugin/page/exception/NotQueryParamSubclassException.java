package com.xsili.mybatis.plugin.page.exception;

import com.xsili.mybatis.plugin.page.model.QueryParam;

/**
 * 查询条件类没有继承QueryParam类的异常
 */
public class NotQueryParamSubclassException extends Exception {

	private static final long serialVersionUID = 1L;

	public NotQueryParamSubclassException() {
		super();
	}

	public NotQueryParamSubclassException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotQueryParamSubclassException(String message) {
		super(message + "查询条件类必须继承" + QueryParam.class.getCanonicalName());
	}

	public NotQueryParamSubclassException(Throwable cause) {
		super(cause);
	}

}
