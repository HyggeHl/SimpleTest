package com.test.springboottest.myTest.hutool;

import cn.hutool.core.util.DesensitizedUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DeSentisization {

    @Test
    public void testDeSitization() {
        System.out.println(DesensitizedUtil.idCardNum("341222199612177752", 6, 4));
    }
}
