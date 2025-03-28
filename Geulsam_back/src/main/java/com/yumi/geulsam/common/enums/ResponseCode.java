package com.yumi.geulsam.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ResponseCode {
    //공통
    SUCCESS("정상 처리되었습니다."),
    FORBIDDEN("접근 권한이 없습니다.");

    private final String message;

}
