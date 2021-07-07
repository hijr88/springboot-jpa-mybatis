package me.yh.initjpaandmybatis;

import me.yh.initjpaandmybatis.account.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    AccountRepository accountRepository;

    @Test
    void contextLoads() {
    }
}
