package com.health.yatra.insurance.yatra.service;

import com.health.yatra.insurance.yatra.model.SubReqModel;
import com.health.yatra.insurance.yatra.model.SubResModel;
import com.health.yatra.insurance.yatra.model.Subscribe;
 

public interface YatraService {
	public SubResModel register (SubReqModel subReqModel);
	public Subscribe getSubId(int subscriberId);
	
	 
}
