package com.oyq.aop;

import com.oyq.domain.User;
import com.oyq.exception.MethodException;
import com.oyq.exception.NameNull;
import com.oyq.exception.Password;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;

@Component
@Aspect
public class UserAop {
    //错误变量
    private int type = 0;

    @Pointcut("execution(* com.oyq.controller.UserController.RegisterUser(..))")
    public void pointcut(){}

//    @Pointcut("execution(* com.oyq.aop.UserAop.around(..))")
//    public void exception(){}

    @Before("pointcut()")
    public String before(JoinPoint joinPoint) throws Exception {
        System.out.println("前置");

        Object[] args = joinPoint.getArgs();

        System.out.println(args[0].toString());

        String name = ((User) args[0]).getUsername();
        String againPassword = ((User) args[0]).getAgainPassword();
        String password = ((User) args[0]).getPassword();

        if(name.equals("") || name == null){
            type = 1;
            throw new NameNull();
        }else if(!againPassword.equals(password)){
            type = 2;
            throw new Password();
        }else if(password.length() < 3){
            type = 3;
            throw new Exception();
        }else{
            type = 0;

            System.out.println("验证成功");

            return "success";
        }
    }


    @After("pointcut()")
    public void after(JoinPoint joinPoint){
        System.out.print("后置");
        System.out.println("方法名：" + joinPoint.getSignature().getName());
    }


    @AfterThrowing(value = "pointcut()", throwing = "e")
    public void except(Throwable e){
        System.out.println("异常通知： " + e.getMessage());
    }



    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable, Exception{
        System.out.println("环绕-前");
        Object proceed = null;
        try {
            proceed = joinPoint.proceed();
            System.out.println("环绕-后" + joinPoint.getSignature().getName()+ "方法调用成功");
            System.out.println("=====================");
            return proceed;
        } catch (Throwable throwable) {
            System.out.println("环绕-后"+ joinPoint.getSignature().getName()+ "方法调用失败");
            System.out.println(throwable.getClass().getName());
            if(type == 0){
                return "未知错误";
            }else if(type == 1){
                throw new NameNull();
            }else if(type == 2){
                return "密码两次不相同";
            }else{
                return "密码长度不足3位";
            }
        }
    }
}
