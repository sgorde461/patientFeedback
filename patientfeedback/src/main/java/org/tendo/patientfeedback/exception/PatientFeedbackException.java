package org.tendo.patientfeedback.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class PatientFeedbackException extends RuntimeException{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String exception;
    private String code;

    public PatientFeedbackException(String code, String exception) {
    	this.setException(exception);
        this.setCode(code);
        
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}