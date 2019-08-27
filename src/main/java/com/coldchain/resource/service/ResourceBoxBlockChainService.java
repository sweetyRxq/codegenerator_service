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
import com.coldchain.resource.client.ResourceBoxSDKClient;
import com.coldchain.resource.entity.ResourceBox;

@RestController
@RequestMapping(value = "/api/blockchain/resourcebox")
public class ResourceBoxBlockChainService {
//GENERATE_START
	private final static String API = "/api/blockchain/resourcebox";
	
	@Autowired
	private ResourceBoxSDKClient resourceBoxSDKClient;	
	/**
	 * 
	 * @Title: saveResourceBox
	 * @Description: 保存测试业务对象
	 * @param entity
	 * @return
	 * @return: Message<Object>
	 */
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Message<Object> saveResourceBox(@RequestBody ResourceBox entity){
		try {
			return resourceBoxSDKClient.save(entity);
		}catch(Exception e) {
			return new Message<Object>("500", String.format("POST %s", API), e.getMessage());
		}
	}
	/**
	 * 
	 * @Title: updateResourceBox
	 * @Description: 修改测试业务对象
	 * @param entity
	 * @return
	 * @return: Message<Object>
	 */
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public Message<Object> updateResourceBox(@RequestBody ResourceBox entity){
		try {
			return resourceBoxSDKClient.update(entity);
		}catch(Exception e) {
			return new Message<Object>("500", String.format("POST %s", API), e.getMessage());
		}
	}
	/**
	 * 
	 * @Title: deleteResourceBox
	 * @Description: 根据ID删除测试业务对象
	 * @param entity
	 * @return
	 * @return: Message<Object>
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Message<Object> deleteResourceBox(@PathVariable String id){
		try {
			return resourceBoxSDKClient.delete(id);
		}catch(Exception e) {
			return new Message<Object>("500", String.format("POST %s", API), e.getMessage());
		}
	}	
	/**
	 * 
	 * @Title: getResourceBox
	 * @Description: 根据ID获取测试业务对象
	 * @param id
	 * @return
	 * @return: Message<ResourceBox>
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Message<ResourceBox> getResourceBox(@PathVariable String id){
		try {
			return resourceBoxSDKClient.get(id);
		}catch(Exception e) {
			return new Message<ResourceBox>("500", String.format("POST %s", API), e.getMessage());
		}
	}
	
	
	/**
	 * 
	 * @Title: QuryAllResourceBox
	 * @Description: 查询所有测试业务对象
	 * @return
	 * @return: Message<List<ResourceBox>>
	 */
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public Message<List<ResourceBox>> QuryAllResourceBox(){
		try {
			return resourceBoxSDKClient.queryAll();
		}catch(Exception e) {
			return new Message<List<ResourceBox>>("500", String.format("POST %s", API), e.getMessage());
		}
	}
	/**
	 * 
	 * @Title: QuryResourceBox
	 * @Description: 根据条件查询测试业务对象（列表格式）
	 * @param params
	 * @return
	 * @return: Message<List<ResourceBox>>
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Message<List<ResourceBox>> quryResourceBox(@RequestParam Map<?,?> params){
		try {
			return resourceBoxSDKClient.query(params);
		}catch(Exception e) {
			return new Message<List<ResourceBox>>("500", String.format("POST %s", API), e.getMessage());
		}
	}
	/**
	 * 
	 * @Title: paginateResourceBox
	 * @Description: 根据条件测试业务对象（翻页格式）
	 * @param params
	 * @return
	 * @return: Message<LedgerPagination<ResourceBox>>
	 */
	@RequestMapping(value = "/paginate", method = RequestMethod.GET)
	public Message<LedgerPagination<ResourceBox>> paginateClsTest(@RequestParam Map<?,?> params){
		try {
			return resourceBoxSDKClient.paginate(params);
		}catch(Exception e) {
			return new Message<LedgerPagination<ResourceBox>>("500", String.format("POST %s", API), e.getMessage());
		}
	}
//GENERATE_END

//OPERATE_GENERATE_START    
//queryByBoxNo_Generate_Start


  public ResourceBox queryByBoxNo(String boxNo) {
 	ResourceBox object = null;
    
    //queryByBoxNo_User_Start 
    //queryByBoxNo_User_End

    return object;
  }
  

//queryByBoxNo_Generate_End
    

//OPERATE_GENERATE_END

}
