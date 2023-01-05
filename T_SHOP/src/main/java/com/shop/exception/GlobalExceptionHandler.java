package com.shop.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(SessionLoginException.class)
	public ResponseEntity<MyErrorDetails> SessionLoginExceptionHandler(SessionLoginException se, WebRequest web){
		MyErrorDetails err= new MyErrorDetails();
		err.setTime(LocalDateTime.now());
		err.setMessage(se.getMessage());
		err.setDescription(web.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(LoginException.class)
	public ResponseEntity<MyErrorDetails> LoginExceptionHandler(LoginException se, WebRequest web){		
		MyErrorDetails err= new MyErrorDetails();
		err.setTime(LocalDateTime.now());
		err.setMessage(se.getMessage());
		err.setDescription(web.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(AdminException.class)
	public ResponseEntity<MyErrorDetails> AdminExceptionHandler(AdminException se, WebRequest web){		
		MyErrorDetails err= new MyErrorDetails();
		err.setTime(LocalDateTime.now());
		err.setMessage(se.getMessage());
		err.setDescription(web.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<MyErrorDetails> ProductExceptionHandler(ProductException se, WebRequest web){		
		MyErrorDetails err= new MyErrorDetails();
		err.setTime(LocalDateTime.now());
		err.setMessage(se.getMessage());
		err.setDescription(web.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(CartException.class)
	public ResponseEntity<MyErrorDetails> CartxceptionHandler(CartException se, WebRequest web){		
		MyErrorDetails err= new MyErrorDetails();
		err.setTime(LocalDateTime.now());
		err.setMessage(se.getMessage());
		err.setDescription(web.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(OrderException.class)
	public ResponseEntity<MyErrorDetails> OrderExceptionHandler(OrderException se, WebRequest web){		
		MyErrorDetails err= new MyErrorDetails();
		err.setTime(LocalDateTime.now());
		err.setMessage(se.getMessage());
		err.setDescription(web.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> exceptionHandler(Exception e, WebRequest web){
		MyErrorDetails err= new MyErrorDetails();
		err.setTime(LocalDateTime.now());
		err.setMessage(e.getMessage());
		err.setDescription(web.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> noHandlerFoundException(NoHandlerFoundException n, WebRequest web){
		MyErrorDetails err= new MyErrorDetails();
		err.setTime(LocalDateTime.now());
		err.setMessage(n.getMessage());
		err.setDescription(web.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException n, WebRequest web){
		MyErrorDetails err= new MyErrorDetails();
		err.setTime(LocalDateTime.now());
		err.setMessage(n.getMessage());
		err.setDescription(web.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<MyErrorDetails> myIllegalArgumentExceptionHandler(IllegalArgumentException n, WebRequest web){
		MyErrorDetails err= new MyErrorDetails();
		err.setTime(LocalDateTime.now());
		err.setMessage(n.getMessage());
		err.setDescription(web.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}

}
