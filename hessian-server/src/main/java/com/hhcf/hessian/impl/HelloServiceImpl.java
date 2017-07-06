package com.hhcf.hessian.impl;

import com.hhcf.hessian.HelloService;

/**
 * 
 * @Title: HelloServiceImpl
 * @Description:
 * @Author: zhaotf
 * @Since:2017年7月6日 下午2:11:46
 * @Version:1.0
 */
public class HelloServiceImpl implements HelloService {

	public Object getRslt(String args) {
		System.out.println("springmvc+hessian:" + args);
		return "springmvc+hessian:" + args;
	}

}
