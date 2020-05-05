package com.example.meimeiss.verification;


import com.example.meimeiss.UtilsOrConstant.FieldUtils;
import com.example.meimeiss.UtilsOrConstant.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;


public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 反射获取方法上的LoginIntercept注解
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        LoginIntercept loginRequired = handlerMethod.getMethod().getAnnotation(LoginIntercept.class);

        //没有注解标记则直接通过
        if (loginRequired == null) {
            return true;
        }

        // 有LoginIntercept注解说明需要登录，提示用户登录
        String authorization = request.getHeader(FieldUtils.AUTHORIZATION);
        if (!StringUtils.isEmpty(authorization) && Objects.nonNull(redisUtils.get(authorization))) {
            return true;
        }

        response.setContentType("application/json; charset=utf-8");
        response.getWriter().print("你访问的资源需要登录");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
