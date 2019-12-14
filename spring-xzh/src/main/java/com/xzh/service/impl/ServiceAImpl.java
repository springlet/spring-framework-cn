package com.xzh.service.impl;

import com.xzh.service.ServiceA;
import com.xzh.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaohe on 2019-12-14.
 * 好好学习，天天向上
 */
@Service
public class ServiceAImpl implements ServiceA {
	@Autowired
	private ServiceB serviceB;

	public ServiceAImpl() {
		System.out.println("ServiceAImpl init");
	}
}
