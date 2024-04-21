package com.jai.rest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jai.entity.Mobile;
import com.jai.service.IMobileService;

@RestController
@RequestMapping("/rest/api")
public class MobileRestController {
	
	@Autowired
	private IMobileService service;
	
	private static final Logger LOG = LoggerFactory.getLogger(MobileRestController.class);
	
	@PostMapping("/mobile")
	public Mobile save(@RequestBody Mobile mobile) {
		LOG.info("Mobile :{}",mobile);
		Mobile saveMobile = service.saveMobile(mobile);
		LOG.debug("save:{}",saveMobile);
		return saveMobile;
	}
	
	@GetMapping("/mobiles")
	public List<Mobile> showMobiles(){
		return service.getAllMobiles();
	}
	
	@GetMapping("/mobiles/{id}")
	public Mobile showById(@PathVariable Integer id){
		Mobile byMobileId = service.getByMobileId(id);
		return byMobileId;
	}
	
	@PutMapping("/mobile")
	public Mobile update(@RequestBody Mobile mobile){
		Mobile updateMobile = service.updateMobile(mobile);
		return updateMobile;
	}
	
	@DeleteMapping("/mobiles/{id}")
	public Mobile deleteById(@PathVariable Integer id){
		Mobile deleteMobile = service.deleteMobile(id);
		return deleteMobile;
	}
	
	
	
}
