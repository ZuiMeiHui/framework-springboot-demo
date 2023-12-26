package com.zuimeihui.demo.controller.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zuimeihui.demo.common.constants.Constants;
import com.zuimeihui.demo.common.pojo.PageBean;
import com.zuimeihui.demo.common.service.BaseResult;
import com.zuimeihui.demo.dto.DemoUserDTO;
import com.zuimeihui.demo.dto.DemoUserQueryDTO;
import com.zuimeihui.demo.service.demo.DemoUserService;

/**
 * DemoUserController
 * 
 * @author 醉美会 ZuiMeiHui.com
 * @date 2023-11-12 20:49:53
 */
@RestController
@RequestMapping("/demo-user")
public class DemoUserController {

	@Autowired
	private DemoUserService demoUserService;

	/**
	 * 列表-带分页
	 * 
	 * @param queryDTO
	 * @return
	 */
	@PostMapping({ "/list/page" })
	public BaseResult<?> listPage(
			@RequestParam(value= Constants.USER_ID_KEY, required = false) String userId,
			@RequestParam(value= Constants.USER_NAME_KEY, required = false) String userName,
			@RequestBody DemoUserQueryDTO queryDTO) {
		queryDTO.setFields("id");
		queryDTO.setOrder("desc");
		PageBean<DemoUserDTO> demoUserDTOs = demoUserService.selectPageBy(queryDTO);
		return BaseResult.success(demoUserDTOs);
	}

	/**
	 * 列表-不带分页
	 * 
	 * @param queryDTO
	 * @return
	 */
	@PostMapping({ "/list" })
	public BaseResult<?> list(
			@RequestParam(value= Constants.USER_ID_KEY, required = false) String userId,
			@RequestParam(value= Constants.USER_NAME_KEY, required = false) String userName,
			@RequestBody DemoUserQueryDTO queryDTO) {
		queryDTO.setFields("id");
		queryDTO.setOrder("desc");
		List<DemoUserDTO> demoUserDTOs = demoUserService.selectBy(queryDTO);
		return BaseResult.success(demoUserDTOs);
	}

	/**
	 * 新增
	 * 
	 * @param dto
	 * @return
	 */
	@PostMapping({ "/add" })
	public BaseResult<?> add(
			@RequestParam(value= Constants.USER_ID_KEY, required = false) String userId,
			@RequestParam(value= Constants.USER_NAME_KEY, required = false) String userName,
			@RequestBody DemoUserDTO dto) {
		demoUserService.save(dto, userId, userName);
		return BaseResult.success(dto.getId());
	}

	/**
	 * 编辑
	 * 
	 * @param dto
	 * @param id
	 * @return
	 */
	@PutMapping({ "/{id}/edit" })
	public BaseResult<?> edit(
			@RequestParam(value= Constants.USER_ID_KEY, required = false) String userId,
			@RequestParam(value= Constants.USER_NAME_KEY, required = false) String userName,
			@RequestBody DemoUserDTO dto, 
			@PathVariable("id") Long id) {
		dto.setId(id);
		demoUserService.save(dto, userId, userName);
		return BaseResult.success(dto.getId());
	}

	/**
	 * 详情
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping({ "/{id}/detail" })
	public BaseResult<?> detail(
			@RequestParam(value= Constants.USER_ID_KEY, required = false) String userId,
			@RequestParam(value= Constants.USER_NAME_KEY, required = false) String userName,
			@PathVariable("id") Long id) {
		DemoUserDTO demoUserDTO = demoUserService.get(id);
		return BaseResult.success(demoUserDTO);
	}

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping({ "/{id}/delete" })
	public BaseResult<?> delete(
			@RequestParam(value= Constants.USER_ID_KEY, required = false) String userId,
			@RequestParam(value= Constants.USER_NAME_KEY, required = false) String userName,
			@PathVariable("id") Long id) {
		demoUserService.remove(id);
		return BaseResult.success(id);
	}
}
