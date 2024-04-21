package com.jai.service;

import java.util.List;

import com.jai.entity.Mobile;

public interface IMobileService {
	
	Mobile saveMobile(Mobile mobile);
	List<Mobile> getAllMobiles();
	Mobile getByMobileId(Integer id);
	Mobile updateMobile(Mobile mobile);
	Mobile deleteMobile(Integer id);
}
