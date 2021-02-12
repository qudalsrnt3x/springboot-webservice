package com.spring.springbootwebservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    // 기본적인 CRUD 메소드 자동으로 추가
    // Entity 클래스와 기본 Entity Repository는 함께 위치해야 한다.
}
