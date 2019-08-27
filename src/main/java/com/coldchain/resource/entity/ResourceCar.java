package com.coldchain.resource.entity;
import java.io.Serializable;
import java.util.List;
import java.util.Date;

public class ResourceCar  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
//GENERATE_START 
	/**
	 * 主键id：
	 */
	private String carId;
	/**
	 * 车辆编号
	 */
	private String carNo;
	/**
	 * 车牌号
	 */
	private String plateNum;
	/**
	 * 车辆状态：0:正常1:删除
	 */
	private Integer state;
	/**
	 *ResourceCar
	 */
	private String dataType = "ResourceCar";

	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getPlateNum() {
		return plateNum;
	}
	public void setPlateNum(String plateNum) {
		this.plateNum = plateNum;
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