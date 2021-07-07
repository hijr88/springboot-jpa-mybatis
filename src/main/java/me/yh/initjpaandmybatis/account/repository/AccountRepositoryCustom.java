package me.yh.initjpaandmybatis.account.repository;

import me.yh.initjpaandmybatis.account.Account;

import java.util.Optional;

public interface AccountRepositoryCustom {

    Optional<Account> findAccount(String id, String nickname);
}
