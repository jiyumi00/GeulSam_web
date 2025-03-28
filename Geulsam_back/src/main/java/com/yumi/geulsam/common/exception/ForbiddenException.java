package com.yumi.geulsam.common.exception;

import com.yumi.geulsam.common.enums.ResponseCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

@Slf4j
public class ForbiddenException extends ApiException {
    public ForbiddenException(ResponseCode responseCode) {
        super(HttpStatus.FORBIDDEN,responseCode.getMessage());

        log.error("[{}] {}",HttpStatus.FORBIDDEN,responseCode.getMessage());
    }
}
