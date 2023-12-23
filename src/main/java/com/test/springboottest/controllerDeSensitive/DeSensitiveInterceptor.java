package com.test.springboottest.controllerDeSensitive;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * 敏感字段拦截器，用于处理请求前的拦截操作。
 * 拦截器会根据是否存在@NoSensitive注解决定是否对敏感字段进行处理。
 * # @NoSensitive 的拦截处理器 则不进行脱敏序列化.
 * @author Andy
 */
//@Component
public class DeSensitiveInterceptor implements HandlerInterceptor {
    /**
     * 在请求处理前进行拦截操作。
     * 设置标识指示是否需要对敏感字段进行处理。
     * 如果有@NOSensitive 则不进行脱敏序列化.
     * @param request HttpServletRequest实例
     * @param response HttpServletResponse实例
     * @param handler 处理器对象
     * @return true表示继续处理请求，false表示终止请求
     * @throws Exception 如果发生异常
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        DeSensitiveJsonSerializer.noSensitiveFlag.set(false);
        // 默认情况下，不需要进行敏感字段处理
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Class<?> beanType = handlerMethod.getBeanType();
            Method method = handlerMethod.getMethod();
            if (beanType.isAnnotationPresent(NoDeSensitive.class) || method.isAnnotationPresent(NoDeSensitive.class)) {
                // 如果控制器类或方法上存在@NoSensitive注解，则不进行@Sensitive注解的处理
                DeSensitiveJsonSerializer.noSensitiveFlag.set(true);
            }
        }
        return true;
    }
}
