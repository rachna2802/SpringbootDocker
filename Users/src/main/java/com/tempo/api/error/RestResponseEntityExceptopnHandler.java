package com.tempo.api.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.tempo.api.model.ErrorMessage;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptopnHandler extends ResponseEntityExceptionHandler {

	public RestResponseEntityExceptopnHandler() {
		// TODO Auto-generated constructor stub
	}
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorMessage> userNotFoundException(UserNotFoundException ex, WebRequest request) {
		ErrorMessage message=new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);

	}

}
