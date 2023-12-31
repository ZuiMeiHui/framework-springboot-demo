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
import com.zuimeihui.demo.dto.DemoDepartmentDTO;
import com.zuimeihui.demo.dto.DemoDepartmentQueryDTO;
import com.zuimeihui.demo.service.demo.DemoDepartmentService;

/**
 * 部门控制器
 * 
 * @ClassName: DemoDepartmentController
 * @Description: TODO
 * @author ZuiMeiHui.com 醉美会
 */
@RestController
@RequestMapping("/demo-department")
public class DemoDepartmentController {

	@Autowired
	private DemoDepartmentService demoDepartmentService;

	/**
	 * 部门列表-带分页
	 * 
	 * @Title: listPage
	 * @Description: TODO
	 * @param @param  userId
	 * @param @param  userName
	 * @param @param  queryDTO
	 * @param @return 参数
	 * @return BaseResult<?> 返回类型
	 * @throws
	 * @author ZuiMeiHui.com 醉美会
	 */
	@PostMapping({ "/list/page" })
	public BaseResult<?> listPage(@RequestParam(value = Constants.USER_ID_KEY, required = false) String userId,
			@RequestParam(value = Constants.USER_NAME_KEY, required = false) String userName,
			@RequestBody DemoDepartmentQueryDTO queryDTO) {
		queryDTO.setFields("id");
		queryDTO.setOrder("desc");
		PageBean<DemoDepartmentDTO> demoDepartmentDTOs = demoDepartmentService.selectPageBy(queryDTO);
		return BaseResult.success(demoDepartmentDTOs);
	}

	/**
	 * 部门列表-不带分页
	 * 
	 * @Title: list
	 * @Description: TODO
	 * @param @param  userId
	 * @param @param  userName
	 * @param @param  queryDTO
	 * @param @return 参数
	 * @return BaseResult<?> 返回类型
	 * @throws
	 * @author ZuiMeiHui.com 醉美会
	 */
	@PostMapping({ "/list" })
	public BaseResult<?> list(@RequestParam(value = Constants.USER_ID_KEY, required = false) String userId,
			@RequestParam(value = Constants.USER_NAME_KEY, required = false) String userName,
			@RequestBody DemoDepartmentQueryDTO queryDTO) {
		queryDTO.setFields("id");
		queryDTO.setOrder("desc");
		List<DemoDepartmentDTO> demoDepartmentDTOs = demoDepartmentService.selectBy(queryDTO);
		return BaseResult.success(demoDepartmentDTOs);
	}

	/**
	 * 部门新增
	 * 
	 * @Title: add
	 * @Description: TODO
	 * @param @param  userId
	 * @param @param  userName
	 * @param @param  dto
	 * @param @return 参数
	 * @return BaseResult<?> 返回类型
	 * @throws
	 * @author ZuiMeiHui.com 醉美会
	 */
	@PostMapping({ "/add" })
	public BaseResult<?> add(@RequestParam(value = Constants.USER_ID_KEY, required = false) String userId,
			@RequestParam(value = Constants.USER_NAME_KEY, required = false) String userName,
			@RequestBody DemoDepartmentDTO dto) {
		demoDepartmentService.save(dto, userId, userName);
		return BaseResult.success(dto.getId());
	}

	/**
	 * 部门编辑
	 * 
	 * @Title: edit
	 * @Description: TODO
	 * @param @param  userId
	 * @param @param  userName
	 * @param @param  dto
	 * @param @param  id
	 * @param @return 参数
	 * @return BaseResult<?> 返回类型
	 * @throws
	 * @author ZuiMeiHui.com 醉美会
	 */
	@PutMapping({ "/{id}/edit" })
	public BaseResult<?> edit(@RequestParam(value = Constants.USER_ID_KEY, required = false) String userId,
			@RequestParam(value = Constants.USER_NAME_KEY, required = false) String userName,
			@RequestBody DemoDepartmentDTO dto, @PathVariable("id") Long id) {
		dto.setId(id);
		demoDepartmentService.save(dto, userId, userName);
		return BaseResult.success(dto.getId());
	}

	/**
	 * 部门详情
	 * 
	 * @Title: detail
	 * @Description: TODO
	 * @param @param  userId
	 * @param @param  userName
	 * @param @param  id
	 * @param @return 参数
	 * @return BaseResult<?> 返回类型
	 * @throws
	 * @author ZuiMeiHui.com 醉美会
	 */
	@GetMapping({ "/{id}/detail" })
	public BaseResult<?> detail(@RequestParam(value = Constants.USER_ID_KEY, required = false) String userId,
			@RequestParam(value = Constants.USER_NAME_KEY, required = false) String userName,
			@PathVariable("id") Long id) {
		DemoDepartmentDTO demoDepartmentDTO = demoDepartmentService.get(id);
		return BaseResult.success(demoDepartmentDTO);
	}

	/**
	 * 部门删除
	 * 
	 * @Title: delete
	 * @Description: TODO
	 * @param @param  userId
	 * @param @param  userName
	 * @param @param  id
	 * @param @return 参数
	 * @return BaseResult<?> 返回类型
	 * @throws
	 * @author ZuiMeiHui.com 醉美会
	 */
	@DeleteMapping({ "/{id}/delete" })
	public BaseResult<?> delete(@RequestParam(value = Constants.USER_ID_KEY, required = false) String userId,
			@RequestParam(value = Constants.USER_NAME_KEY, required = false) String userName,
			@PathVariable("id") Long id) {
		demoDepartmentService.remove(id);
		return BaseResult.success(id);
	}
}
