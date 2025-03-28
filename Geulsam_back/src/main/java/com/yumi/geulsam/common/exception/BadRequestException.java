package com.yumi.geulsam.common.exception;

import com.yumi.geulsam.common.enums.ResponseCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

@Slf4j
public class BadRequestException extends ApiException {
    public BadRequestException(ResponseCode responseCode) {
        super(HttpStatus.BAD_REQUEST,responseCode.getMessage());

        log.error("[{}] {}",HttpStatus.BAD_REQUEST,responseCode.getMessage());
    }
}
