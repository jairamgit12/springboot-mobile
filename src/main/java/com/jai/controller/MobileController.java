package com.jai.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jai.entity.Mobile;
import com.jai.service.IMobileService;

@Controller
@RequestMapping("/api")
public class MobileController {
	
	@Autowired
	private IMobileService service;
	
	private static final Logger LOG = LoggerFactory.getLogger(MobileController.class);
	
	@RequestMapping(value = "/mobile",method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Mobile save(@RequestBody Mobile mobile) {
		LOG.info("Mobile :{}",mobile);
		Mobile saveMobile = service.saveMobile(mobile);
		LOG.debug("save:{}",saveMobile);
		return saveMobile;
	}
	
	@RequestMapping(value = "/mobiles",method = RequestMethod.GET,headers = "Accept=application/json")
	@ResponseBody
	public List<Mobile> showMobiles(){
		return service.getAllMobiles();
	}
	
	@RequestMapping(value = "/mobiles/{id}",method = RequestMethod.GET)
	@ResponseBody
	public Mobile showById(@PathVariable Integer id){
		Mobile byMobileId = service.getByMobileId(id);
		return byMobileId;
	}
	
	@RequestMapping(value = "/mobile",method = RequestMethod.PUT,headers = "Accept=application/json")
	@ResponseBody
	public Mobile update(@RequestBody Mobile mobile){
		Mobile updateMobile = service.updateMobile(mobile);
		return updateMobile;
	}
	
	@RequestMapping(value = "/mobiles/{id}",method = RequestMethod.DELETE)
	@ResponseBody
	public Mobile deleteById(@PathVariable Integer id){
		Mobile deleteMobile = service.deleteMobile(id);
		return deleteMobile;
	}
	
	
	
}
