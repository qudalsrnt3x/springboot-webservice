package com.spring.springbootwebservice.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class HelloResponseDtoTest {

    @Test
    @DisplayName("롬복 기능 테스트")
    public void testLombok() throws Exception{
        // given
        String name = "test";
        int amount = 10000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}