package com.spring.springbootwebservice.web.dto;

// 모든 응답dto를 받는다.

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor    // final 필드가 포함된 생성자를 생성해준다.
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
