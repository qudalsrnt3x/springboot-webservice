package com.spring.springbootwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication
// 스프링의 자동 설정, 스프링 Bean 읽기, 생성을 자동으로 설정해준다.
// 항상 프로젝트 최상단에 위치해야 한다. (componentScan)
public class SpringbootWebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebserviceApplication.class, args);
    }
    // 내장 WAS 를 사용하는 이유 : 언제 어디서나 같은 환경에서 스프링 부트를 배포할 수 있다.

}
