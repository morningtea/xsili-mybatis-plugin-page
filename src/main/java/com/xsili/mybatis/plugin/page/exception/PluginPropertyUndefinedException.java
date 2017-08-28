package com.xsili.mybatis.plugin.page.exception;

/**
 * 插件属性未定义异常
 */
public class PluginPropertyUndefinedException extends Exception {

    private static final long serialVersionUID = 1L;

	public PluginPropertyUndefinedException() {
		super();
	}

	public PluginPropertyUndefinedException(String message, Throwable cause) {
		super(message, cause);
	}

	public PluginPropertyUndefinedException(String message) {
		super(message + "属性没有定义，请检查Mybatis配置文件中是否有定义该属性");
	}

	public PluginPropertyUndefinedException(Throwable cause) {
		super(cause);
	}

}
