package com.test.springboottest.Entity;

import com.test.springboottest.Enum.DesensitizationTypeEnum;
import com.test.springboottest.controllerDeSensitive.DeSensitive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestPojo {
    private String userName;

    @DeSensitive(type = DesensitizationTypeEnum.MOBILE_PHONE)
    private String phone;

    @DeSensitive(type = DesensitizationTypeEnum.PASSWORD)
    private String password;

    @DeSensitive(type = DesensitizationTypeEnum.MY_RULE, startInclude = 0, endExclude = 2)
    private String address;
}
