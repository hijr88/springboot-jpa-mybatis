package me.yh.initjpaandmybatis.account.repository;

import me.yh.initjpaandmybatis.account.Account;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Rollback(value = false)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@AutoConfigureMybatis
@DataJpaTest
class AccountRepositoryTest {

    @Autowired
    AccountRepository repository;

    @Test
    void findAccountById() {
        Optional<Account> woo = repository.findAccountById("woo");
        assertTrue(woo.isPresent());
    }

    @Test
    void findAccountByIdAndPlatformType() {
        Optional<Account> woo = repository.findAccountByIdAndPlatformType("woo", "this");
        assertTrue(woo.isPresent());
    }

    @Test
    void findAccount() {
        Optional<Account> woo = repository.findAccount(null, "네버");
        assertTrue(woo.isPresent());
    }
}