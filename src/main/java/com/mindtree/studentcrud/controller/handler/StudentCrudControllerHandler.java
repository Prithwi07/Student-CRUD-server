package com.mindtree.studentcrud.controller.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mindtree.studentcrud.dto.ErrorResponse;
import com.mindtree.studentcrud.exception.StudentCrudAppException;
import com.mindtree.studentcrud.exception.service.NoResultFounndException;

@RestControllerAdvice
public class StudentCrudControllerHandler {

	@ExceptionHandler(NoResultFounndException.class )
	public ResponseEntity<?> noStudent(StudentCrudAppException ex) {
		return new ResponseEntity<ErrorResponse>(new ErrorResponse(ex.getCause(), ex.getMessage()),
				HttpStatus.BAD_REQUEST);
	}

}
