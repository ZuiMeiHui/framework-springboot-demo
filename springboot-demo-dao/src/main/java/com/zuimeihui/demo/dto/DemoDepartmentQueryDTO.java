package com.zuimeihui.demo.dto;

import java.io.Serializable;
import java.util.Date;

import com.zuimeihui.demo.common.dto.PageCustom;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Tolerate;

/**
 * 部门表queryDTO
 * 
 * @ClassName: DemoDepartmentQueryDTO
 * @Description: TODO
 * @author ZuiMeiHui.com 醉美会
 */
@Setter
@Getter
@ToString
@Builder
public class DemoDepartmentQueryDTO extends PageCustom implements Serializable {

	private static final long serialVersionUID = 1L;

	@Tolerate
	public DemoDepartmentQueryDTO() {

	}

	private Long id;

	private Date timeCreateBegin;

	private Date timeCreateEnd;

	private Date timeUpdateBegin;

	private Date timeUpdateEnd;

	private Long upId;

	private String name;

	private Boolean freeze;

}