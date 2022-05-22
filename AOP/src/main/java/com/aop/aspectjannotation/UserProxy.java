package com.aop.aspectjannotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author Jiahao Wang
 * @Description 增强类
 * @create 2022-05-17 19:01
 */

@Aspect
public class UserProxy {

	// 相同切入点抽取（就不用每一个写一遍了）
	@Pointcut(value = "execution(* com.aop.aspectjannotation..User.add(..))")
	public void pointcutDemo (){
		// 并不会真的输出
		System.out.println("pointcutDemo");
	}

	// @Before 表示前置通知
	@Before(value = "pointcutDemo()")
	public void before() {
		System.out.println("before");
	}

	// 最终通知：在方法之后执行，不管有没有异常
	@After(value = "pointcutDemo()")
	public void after(){
		System.out.println("after");
	}

	// 在方法返回值之后执行，只有没有异常，正确结束时才执行
	@AfterReturning(value = "pointcutDemo()")
	public void afterReturning(){
		System.out.println("afterReturning");
	}

	// 异常通知
	@AfterThrowing(value = "pointcutDemo()")
	public void afterThrowing(){
		System.out.println("afterThrowing");
	}

	// 环绕通知
	@Around(value = "pointcutDemo()")
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("before around");

		// 被增强方法执行前后分界点
		proceedingJoinPoint.proceed();

		System.out.println("after around");

	}
}
