package com.test.springboottest.myTest.jwt;

import io.jsonwebtoken.*;
import lombok.Value;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @program: springbootTest
 * @description: JwtUtil
 * @author: hygge
 * @create: 2023/07/31
 */

public class JwtUtil {
  private final String secretKey = "qweasd";

  public String createJWT(String id, String subject, long ttlMillis, Map<String, Object> map) throws Exception {
    JwtBuilder builder = Jwts.builder()
      .setId(id)
      .setSubject(subject) // 发行者
      .setIssuedAt(new Date()) // 发行时间
      .signWith(SignatureAlgorithm.HS256, secretKey); // 签名类型 与 密钥
//      .compressWith(CompressionCodecs.DEFLATE);// 对载荷进行压缩
    if (!CollectionUtils.isEmpty(map)) {
      builder.setClaims(map);
    }
    if (ttlMillis > 0) {
      builder.setExpiration(new Date(System.currentTimeMillis() + ttlMillis));
    }
    return builder.compact();
  }


  public Claims parseJWT(String jwtString) {
    return Jwts.parser().setSigningKey(secretKey)
      .parseClaimsJws(jwtString)
      .getBody();
  }

  @Test
  void testCreateJWT() throws Exception {
    Map<String, Object> map = new HashMap<>();
    map.put("name", "张三");
    map.put("age", 25);
    String uuid = UUID.randomUUID().toString().replace("-", "");
    String jwtStr = createJWT(uuid, "login subject", 0L, map);
    System.out.println("jwt:" + jwtStr);
  }
}
