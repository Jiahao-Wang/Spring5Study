package com.aop.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-17 17:38
 */
public class Client {
	public static void main(String[] args) {

		Class[] interfaces = {UserDao.class};

		UserDaoImpl userDao = new UserDaoImpl();

		// 第一个参数：ClassLoader loader：类加载器，用于加载代理类，使用真实对象的类加载 器即可
		// 第二个参数：Class<?>[] interfaces：真实对象所实现的接口
		// 第三个参数：InvocationHandler h：代理对象的调用处理程序。会把当前执行 的目标对象方法作为参数传入
		UserDao dao = (UserDao) Proxy.newProxyInstance(Client.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));

		int result = dao.add(1, 2);
	}
}
