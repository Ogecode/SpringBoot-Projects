package com.ogbonnaya.CRUD_project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID =1L;
    private String fieldName;
    private String resourceName;
    private Object fieldValue;

    // generate a constructor for the fields
    public ResourceNotFoundException(String fieldName, String resourceName, Object fieldValue) {
        super(String.format("% not found with % : '%s'", resourceName, fieldName, fieldValue) );
        this.fieldName = fieldName;
        this.resourceName = resourceName;
        this.fieldValue = fieldValue;
    }
// generate getters for fields

    public String getFieldName() {
        return fieldName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }
}
