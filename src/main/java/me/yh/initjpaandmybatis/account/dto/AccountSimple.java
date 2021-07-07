package me.yh.initjpaandmybatis.account.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("accountSimple")
@Data
public class AccountSimple {

    private String id;
    private String password;
    private String nickname;
    private String platformType;
}
