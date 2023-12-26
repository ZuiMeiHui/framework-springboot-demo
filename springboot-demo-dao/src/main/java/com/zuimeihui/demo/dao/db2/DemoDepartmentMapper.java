package com.zuimeihui.demo.dao.db2;

import org.apache.ibatis.annotations.Mapper;

import com.zuimeihui.demo.common.dao.BaseMapper;
import com.zuimeihui.demo.dto.DemoDepartmentDTO;
import com.zuimeihui.demo.dto.DemoDepartmentQueryDTO;

/**
 * 部门表Mapper
 * 
 * @author 醉美会 ZuiMeiHui.com
 * @date 2023-12-03 11:22:47
 */
@Mapper
public interface DemoDepartmentMapper extends BaseMapper<DemoDepartmentDTO, DemoDepartmentQueryDTO> {

}