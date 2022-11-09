package com.empreget.exception;

public class NegocioException extends RuntimeException {
	
	public NegocioException(String message){
        super(message);
    }
}
