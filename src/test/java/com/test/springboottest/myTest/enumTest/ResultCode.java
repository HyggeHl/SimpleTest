package com.test.springboottest.myTest.enumTest;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/09/16
 */
public enum ResultCode {
  SUCCESS(200, "操作成功"),
  FAILED(500, "操作失败"),
  VALIDATE_FAILED(404, "参数检验失败"),
  UNAUTHORIZED(401, "暂未登录或token已经过期"),
  FORBIDDEN(403, "没有相关权限"),
  NOCONTENT(204, "No content");
  private long code;
  private String message;

  private ResultCode(long code, String message) {
    this.code = code;
    this.message = message;
  }

  public long getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }

  public static ResultCode getByCode(long code) {
    Optional<ResultCode> optional =
            Arrays.stream(ResultCode.values())
                    .filter(v -> Objects.equals(v.getCode(), code))
                    .findFirst();

    return optional.orElse(ResultCode.NOCONTENT);
  }

  public static ResultCode getByMessage(String message) {
    Optional<ResultCode> optional =
            Arrays.stream(ResultCode.values())
                    .filter(v -> Objects.equals(v.getMessage(), NOCONTENT))
                    .findFirst();

    return optional.orElse(ResultCode.NOCONTENT);
  }

}
