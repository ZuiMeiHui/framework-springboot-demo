package com.zuimeihui.demo.service.demo;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.zuimeihui.demo.common.service.BaseResult;
import com.zuimeihui.demo.common.service.BaseService;
import com.zuimeihui.demo.dao.db2.DemoDepartmentMapper;
import com.zuimeihui.demo.dto.DemoDepartmentDTO;
import com.zuimeihui.demo.dto.DemoDepartmentQueryDTO;

/**
 * 部门服务层
 * 
 * @ClassName: DemoDepartmentService
 * @Description: TODO
 * @author ZuiMeiHui.com 醉美会
 */
@Service
public class DemoDepartmentService
		extends BaseService<DemoDepartmentMapper, DemoDepartmentDTO, DemoDepartmentQueryDTO> {

	/**
	 * 保存和更新
	 * 
	 * @Title: save
	 * @Description: TODO
	 * @param @param dto
	 * @param @param userId
	 * @param @param userName 参数
	 * @return void 返回类型
	 * @throws
	 * @author ZuiMeiHui.com 醉美会
	 */
	public void save(DemoDepartmentDTO dto, String userId, String userName) {
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
	public DemoDepartmentQueryDTO handleQueryParam(DemoDepartmentQueryDTO queryDTO) {
		return queryDTO;
	}

	/**
	 * 结果集加载
	 */
	@Override
	public DemoDepartmentDTO handleQueryResult(DemoDepartmentDTO dto) {
		return dto;
	}

	/**
	 * 检查保存入参
	 */
	@Override
	public BaseResult<?> checkSaveInput(DemoDepartmentDTO dto) {
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
