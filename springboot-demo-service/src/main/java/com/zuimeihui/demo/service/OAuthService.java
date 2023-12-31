package com.zuimeihui.demo.service;

import org.springframework.stereotype.Service;

import com.zuimeihui.demo.pojo.DemoUser;

/**
 * 服务端API通用鉴权类
 * 
 * @ClassName: OAuthService
 * @Description: TODO
 * @author ZuiMeiHui.com 醉美会
 */
@Service
public class OAuthService {

	/**
	 * 对Token鉴权
	 * 
	 * @Title: checkToken
	 * @Description: TODO
	 * @param @param  token
	 * @param @return 参数
	 * @return DemoUser 返回类型
	 * @throws
	 * @author ZuiMeiHui.com 醉美会
	 */
	public DemoUser checkToken(String token) {
		// 例子，具体鉴权方法需根据用户接口自行实现
		DemoUser demoUser = new DemoUser();
		demoUser.setId(1L);
		demoUser.setName("LiYang");
		return demoUser;
	}
}
