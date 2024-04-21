package com.jai.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jai.entity.Mobile;
import com.jai.repo.MobileRepo;
import com.jai.service.IMobileService;

@Service
public class MobileService implements IMobileService {
	
	@Autowired
	private MobileRepo mobileRepo;
	
	private static final Logger LOG = LoggerFactory.getLogger(MobileService.class);

	@Override
	public Mobile saveMobile(Mobile mobile) {
		LOG.info("Mobile Details:{}",mobile);
		Mobile save = mobileRepo.save(mobile);
		LOG.debug("Mobile:{}",save);
		return save;
	}

	@Override
	public List<Mobile> getAllMobiles() {
		return mobileRepo.findAll();
	}

	@Override
	public Mobile getByMobileId(Integer id) {
		return mobileRepo.findById(id).get();
	}

	@Override
	public Mobile updateMobile(Mobile details) {
		LOG.info("Mobile details:{}",details);
		Mobile mobile = mobileRepo.findById(details.getId()).get();
		mobile.setModelName(details.getModelName());
		mobile.setDescription(details.getDescription());
		mobile.setRamSize(details.getRamSize());
		mobile.setRomSize(details.getRomSize());
		mobile.setPrice(details.getPrice());
		mobile.setColor(details.getColor());
		mobile.setWeight(details.getWeight());
		mobile.setBatteryCapacity(details.getBatteryCapacity());
		mobile.setStatus(details.getStatus());
		mobile.setScreenSize(details.getScreenSize());
		mobile.setOs(details.getOs());
		mobile.setProcessor(details.getProcessor());
		mobile.setRearCamera(details.getRearCamera());
		mobile.setFrontCamera(details.getFrontCamera());
		mobile.setBestReview(details.getBestReview());
		mobile.setRating(details.getRating());
		mobile.setCountryofOrigin(details.getCountryofOrigin());
		mobile.setDateFirstAvailable(details.getDateFirstAvailable());
		mobile.setCreatedDate(details.getCreatedDate());
		mobile.setModifiedDate(details.getModifiedDate());
		Mobile save = mobileRepo.save(mobile);
		LOG.debug("Mobile:{}",save);
		return save;
	}

	@Override
	public Mobile deleteMobile(Integer id) {
		Mobile byId = mobileRepo.findById(id).get();
		mobileRepo.delete(byId);
		return byId;
	}

}
