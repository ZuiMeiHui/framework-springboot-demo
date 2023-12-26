package com.zuimeihui.demo.service.demo;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.zuimeihui.demo.common.service.BaseResult;
import com.zuimeihui.demo.common.service.BaseService;
import com.zuimeihui.demo.dao.db1.DemoUserMapper;
import com.zuimeihui.demo.dto.DemoUserDTO;
import com.zuimeihui.demo.dto.DemoUserQueryDTO;

/**
 * 用户表，服务层
 * 
 * @author 醉美会 ZuiMeiHui.com
 * @date 2023-11-12 20:29:00
 */
@Service
public class DemoUserService extends BaseService<DemoUserMapper, DemoUserDTO, DemoUserQueryDTO> {

	/**
	 * 保存和更新
	 * 
	 * @param dto
	 */
	public void save(DemoUserDTO dto, String userId, String userName) {
		dto.setAdminId(userId);
		dto.setAdminName(userName);
		dto.setTimeUpdate(new Date());
		if (dto.getId() == null) {
			dto.setTimeCreate(new Date());
			dto.setFreeze(false);
			mapper.insertSelective(dto);
		} else {
			mapper.updateByPrimaryKeySelective(dto);
		}
	}
	
	/**
	 * 入参加载
	 */
	@Override
	public DemoUserQueryDTO handleQueryParam(DemoUserQueryDTO queryDTO) {
		return queryDTO;
	}

	/**
	 * 结果集加载
	 */
	@Override
	public DemoUserDTO handleQueryResult(DemoUserDTO dto) {
		return dto;
	}
	
	/**
	 * 检查保存入参
	 */
	@Override
	public BaseResult<?> checkSaveInput(DemoUserDTO dto) {
		return BaseResult.success();
	}
	
	/**
	 * 检查删除入参
	 */
	@Override
	public BaseResult<?> checkRemove(Long id) {
		return BaseResult.success();
	}
}
