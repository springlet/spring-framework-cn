package com.xzh;

import com.xzh.config.AppConfig;
import com.xzh.service.ServiceA;
import com.xzh.service.ServiceB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xiaohe on 2019-12-14.
 * 好好学习，天天向上
 */
public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		ServiceA serviceA = (ServiceA) applicationContext.getBean("serviceAImpl");
		ServiceB serviceB = (ServiceB) applicationContext.getBean("serviceBImpl");
	}
}
