package com.yumi.geulsam.common.exception;

import com.yumi.geulsam.common.enums.ResponseCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

@Slf4j
public class UnanthorizedException extends ApiException {
    public UnanthorizedException(ResponseCode responseCode) {
        super(HttpStatus.UNAUTHORIZED,responseCode.getMessage());

        log.error("[{}] {}",HttpStatus.UNAUTHORIZED,responseCode.getMessage());
    }
}
