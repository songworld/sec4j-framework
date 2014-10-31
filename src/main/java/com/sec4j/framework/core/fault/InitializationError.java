package com.sec4j.framework.core.fault;


public class InitializationError extends Error {

    /**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = 902908105877445217L;

	public InitializationError() {
        super();
    }

    public InitializationError(String message) {
        super(message);
    }

    public InitializationError(String message, Throwable cause) {
        super(message, cause);
    }

    public InitializationError(Throwable cause) {
        super(cause);
    }
}
