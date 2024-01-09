package com.health.yatra.insurance.yatra.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.yatra.insurance.yatra.model.Address;
import com.health.yatra.insurance.yatra.model.SubReqModel;
import com.health.yatra.insurance.yatra.model.SubResModel;
import com.health.yatra.insurance.yatra.model.Subscribe;
import com.health.yatra.insurance.yatra.repository.AddressRepository;
import com.health.yatra.insurance.yatra.repository.SubscribeRepository;

@Service
public class ServiceImp implements YatraService{
	@Autowired
    private SubscribeRepository subscribeRepository;

    @Autowired
    private AddressRepository addressRepository;

    public SubResModel register(SubReqModel subReqModel) {
        Subscribe subscribe = subReqModel.getSubscribe();
        Address address = subReqModel.getAddress();

        double d = Math.random();
        String accno =Double.toString(d).substring(2);
        subscribe.setAccnumber(accno);
        
        SubResModel subResModel = new SubResModel();
        subResModel.setSubscribe(subscribe);
        subResModel.setAddress(address);
        subResModel.setAccnumber(accno);
        subscribeRepository.save(subscribe);
        addressRepository.save(address);
        return subResModel;
    }
   
	@Override
	public Subscribe getSubId(int subscriberId) {
		Optional<Subscribe> subscribe = subscribeRepository.findById(subscriberId);
		
		return subscribe.get();
	}

	

	
	
	
	 


	 

	
		
		 
		
	




}
