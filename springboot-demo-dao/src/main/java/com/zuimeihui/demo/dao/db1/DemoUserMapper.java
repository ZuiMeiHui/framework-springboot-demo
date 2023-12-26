package com.zuimeihui.demo.dao.db1;

import org.apache.ibatis.annotations.Mapper;

import com.zuimeihui.demo.common.dao.BaseMapper;
import com.zuimeihui.demo.dto.DemoUserDTO;
import com.zuimeihui.demo.dto.DemoUserQueryDTO;

/**
 * 用户表Mapper
 * 
 * @author 醉美会 ZuiMeiHui.com
 * @date 2023-11-12 14:52:39
 */
@Mapper
public interface DemoUserMapper extends BaseMapper<DemoUserDTO, DemoUserQueryDTO> {

}