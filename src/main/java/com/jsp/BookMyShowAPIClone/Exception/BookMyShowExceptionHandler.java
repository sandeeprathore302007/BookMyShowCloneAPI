package com.jsp.BookMyShowAPIClone.Exception;

 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.jsp.BookMyShowAPIClone.util.ResponseStructure;
// to raise a exception
@RestControllerAdvice
public class BookMyShowExceptionHandler  extends ResponseEntityExceptionHandler{
	@ExceptionHandler
	  public ResponseEntity<ResponseStructure<String>> ownerIdNotFound(OwnerIdNotFoundException ex)
	  {
		ResponseStructure<String> structure = new ResponseStructure<String>();
		
		structure.setMessage("Id not found for Owner");
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(ex.getMessage());
		
		return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.NOT_FOUND);
	  }

}
