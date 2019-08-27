package com.coldchain.resource.entity;
import java.io.Serializable;
import java.util.List;
import java.util.Date;

public class ResourceBox  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
//GENERATE_START 
	/**
	 * 主键id：
	 */
	private String boxId;
	/**
	 * 箱子编号
	 */
	private String boxNo;
	/**
	 * 箱子状态：0:正常1:删除
	 */
	private Integer state;
	/**
	 *ResourceBox
	 */
	private String dataType = "ResourceBox";

	public String getBoxId() {
		return boxId;
	}
	public void setBoxId(String boxId) {
		this.boxId = boxId;
	}
	public String getBoxNo() {
		return boxNo;
	}
	public void setBoxNo(String boxNo) {
		this.boxNo = boxNo;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
    public String getDataType() {
    	return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
//GENERATE_END
}