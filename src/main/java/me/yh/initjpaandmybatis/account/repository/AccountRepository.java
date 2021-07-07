package me.yh.initjpaandmybatis.account.repository;

import me.yh.initjpaandmybatis.account.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Mapper
public interface AccountRepository extends JpaRepository<Account, String>, AccountRepositoryCustom {

    Optional<Account> findAccountById(String id);

    Optional<Account> findAccountByIdAndPlatformType(String id, String platformType);
}
