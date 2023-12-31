package com.zuimeihui.demo.dao.db1;

import org.apache.ibatis.annotations.Mapper;

import com.zuimeihui.demo.common.dao.BaseMapper;
import com.zuimeihui.demo.dto.DemoUserDTO;
import com.zuimeihui.demo.dto.DemoUserQueryDTO;

/**
 * 用户表Mapper
 * 
 * @ClassName: DemoUserMapper
 * @Description: TODO
 * @author ZuiMeiHui.com 醉美会
 */
@Mapper
public interface DemoUserMapper extends BaseMapper<DemoUserDTO, DemoUserQueryDTO> {

}