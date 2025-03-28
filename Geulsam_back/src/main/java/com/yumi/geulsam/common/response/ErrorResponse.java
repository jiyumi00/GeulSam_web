package com.yumi.geulsam.common.response;

import com.yumi.geulsam.common.exception.ApiException;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ErrorResponse extends BaseResponse{
    LocalDateTime timestamp;

    private ErrorResponse(ApiException apiException){
        super(apiException.getHttpStatus().value(),apiException.getMessage());
        this.timestamp=LocalDateTime.now();
    }

    public static ErrorResponse from(ApiException apiException){
        return new ErrorResponse(apiException);
    }
}
