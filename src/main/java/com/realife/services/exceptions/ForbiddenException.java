package com.realife.services.exceptions;

import org.springframework.http.HttpStatus;

import com.realife.services.models.ErrorResponse;

public class ForbiddenException extends ResponseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ForbiddenException() {
		super();
	}

	public ForbiddenException(String message, Throwable cause) {
		super(message, cause);
	}

	public ForbiddenException(String message) {
		super(message);
	}

	public ForbiddenException(Throwable cause) {
		super(cause);
	}
	
	@Override
	public ErrorResponse getResponse() {
		return new ErrorResponse("Forbidden");
	}
	
	@Override
	public HttpStatus getHttpStatus() {
		return HttpStatus.FORBIDDEN;
	}
}
