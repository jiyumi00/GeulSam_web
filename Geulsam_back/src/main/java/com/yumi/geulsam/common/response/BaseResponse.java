package com.yumi.geulsam.common.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BaseResponse {
    private final int statusCode;
    private final String message;
}
