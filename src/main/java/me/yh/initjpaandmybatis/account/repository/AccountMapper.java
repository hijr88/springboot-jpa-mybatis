package me.yh.initjpaandmybatis.account.repository;

import me.yh.initjpaandmybatis.account.dto.AccountSimple;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AccountMapper {

    Map<String, Object> mybatisFindAccountById(String id);

    List<Map<String, Object>> mybatisFindAllAccount();

    AccountSimple aliasFindAccountById(String id);

    List<AccountSimple> aliasFindAllAccount();
}
