package com.coldchain.resource.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mchain.apollo.client.sdk.entity.LedgerPagination;
import com.mchain.apollo.core.entity.Message;
import com.coldchain.resource.client.ResourceCarSDKClient;
import com.coldchain.resource.entity.ResourceCar;

@RestController
@RequestMapping(value = "/api/blockchain/resourcecar")
public class ResourceCarBlockChainService {
//GENERATE_START
	private final static String API = "/api/blockchain/resourcecar";
	
	@Autowired
	private ResourceCarSDKClient resourceCarSDKClient;	
	/**
	 * 
	 * @Title: saveResourceCar
	 * @Description: 保存测试业务对象
	 * @param entity
	 * @return
	 * @return: Message<Object>
	 */
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Message<Object> saveResourceCar(@RequestBody ResourceCar entity){
		try {
			return resourceCarSDKClient.save(entity);
		}catch(Exception e) {
			return new Message<Object>("500", String.format("POST %s", API), e.getMessage());
		}
	}
	/**
	 * 
	 * @Title: updateResourceCar
	 * @Description: 修改测试业务对象
	 * @param entity
	 * @return
	 * @return: Message<Object>
	 */
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public Message<Object> updateResourceCar(@RequestBody ResourceCar entity){
		try {
			return resourceCarSDKClient.update(entity);
		}catch(Exception e) {
			return new Message<Object>("500", String.format("POST %s", API), e.getMessage());
		}
	}
	/**
	 * 
	 * @Title: deleteResourceCar
	 * @Description: 根据ID删除测试业务对象
	 * @param entity
	 * @return
	 * @return: Message<Object>
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Message<Object> deleteResourceCar(@PathVariable String id){
		try {
			return resourceCarSDKClient.delete(id);
		}catch(Exception e) {
			return new Message<Object>("500", String.format("POST %s", API), e.getMessage());
		}
	}	
	/**
	 * 
	 * @Title: getResourceCar
	 * @Description: 根据ID获取测试业务对象
	 * @param id
	 * @return
	 * @return: Message<ResourceCar>
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Message<ResourceCar> getResourceCar(@PathVariable String id){
		try {
			return resourceCarSDKClient.get(id);
		}catch(Exception e) {
			return new Message<ResourceCar>("500", String.format("POST %s", API), e.getMessage());
		}
	}
	
	
	/**
	 * 
	 * @Title: QuryAllResourceCar
	 * @Description: 查询所有测试业务对象
	 * @return
	 * @return: Message<List<ResourceCar>>
	 */
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public Message<List<ResourceCar>> QuryAllResourceCar(){
		try {
			return resourceCarSDKClient.queryAll();
		}catch(Exception e) {
			return new Message<List<ResourceCar>>("500", String.format("POST %s", API), e.getMessage());
		}
	}
	/**
	 * 
	 * @Title: QuryResourceCar
	 * @Description: 根据条件查询测试业务对象（列表格式）
	 * @param params
	 * @return
	 * @return: Message<List<ResourceCar>>
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Message<List<ResourceCar>> quryResourceCar(@RequestParam Map<?,?> params){
		try {
			return resourceCarSDKClient.query(params);
		}catch(Exception e) {
			return new Message<List<ResourceCar>>("500", String.format("POST %s", API), e.getMessage());
		}
	}
	/**
	 * 
	 * @Title: paginateResourceCar
	 * @Description: 根据条件测试业务对象（翻页格式）
	 * @param params
	 * @return
	 * @return: Message<LedgerPagination<ResourceCar>>
	 */
	@RequestMapping(value = "/paginate", method = RequestMethod.GET)
	public Message<LedgerPagination<ResourceCar>> paginateClsTest(@RequestParam Map<?,?> params){
		try {
			return resourceCarSDKClient.paginate(params);
		}catch(Exception e) {
			return new Message<LedgerPagination<ResourceCar>>("500", String.format("POST %s", API), e.getMessage());
		}
	}
//GENERATE_END

//OPERATE_GENERATE_START    

//OPERATE_GENERATE_END

}