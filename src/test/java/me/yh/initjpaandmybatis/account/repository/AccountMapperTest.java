package me.yh.initjpaandmybatis.account.repository;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.util.List;
import java.util.Map;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@MybatisTest
class AccountMapperTest {
    /*
        마이바티스 테스트 방법
        http://mybatis.org/spring-boot-starter/mybatis-spring-boot-test-autoconfigure/index.html
     */

    @Autowired
    AccountMapper mapper;

    @Test
    void mybatisFindAccountById() {
        Map<String, Object> woo = mapper.mybatisFindAccountById("woo");
    }

    @Test
    void mybatisFindAllAccount() {
        List<Map<String, Object>> list = mapper.mybatisFindAllAccount();
    }

    @Test
    void aliasFindAccountById() {
        mapper.aliasFindAccountById("woo");
    }

    @Test
    void aliasFindAllAccount() {
        mapper.aliasFindAllAccount();
    }
}