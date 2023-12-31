package com.zuimeihui.demo.dao.db2;

import org.apache.ibatis.annotations.Mapper;

import com.zuimeihui.demo.common.dao.BaseMapper;
import com.zuimeihui.demo.dto.DemoDepartmentDTO;
import com.zuimeihui.demo.dto.DemoDepartmentQueryDTO;

/**
 * 部门表Mapper
 * 
 * @ClassName: DemoDepartmentMapper
 * @Description: TODO
 * @author ZuiMeiHui.com 醉美会
 */
@Mapper
public interface DemoDepartmentMapper extends BaseMapper<DemoDepartmentDTO, DemoDepartmentQueryDTO> {

}