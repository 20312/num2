package com.oyq.handler;

import com.oyq.exception.NameNull;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(annotations = Aspect.class)
public class GlobalExceptionInterceptor {

    /**
     * 捕获自定义异常，返回json信息
     */


    @ExceptionHandler({NameNull.class})
    @ResponseBody
    public String errorHandle(Exception e) throws Exception {

        return "系统出错：";
    }
}
