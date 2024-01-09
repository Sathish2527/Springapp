package com.health.yatra.insurance.yatra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.yatra.insurance.yatra.model.SubReqModel;
import com.health.yatra.insurance.yatra.model.SubResModel;
import com.health.yatra.insurance.yatra.model.Subscribe;
import com.health.yatra.insurance.yatra.service.YatraService;
@RestController
@EnableTransactionManagement
@RequestMapping("/health")
public class YatraController {
	@Autowired
	private YatraService service;
	@PostMapping("/register")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public ResponseEntity<SubResModel>register(@RequestBody SubReqModel subReqModel)
	{
	        return new ResponseEntity<SubResModel>(service.register(subReqModel),HttpStatus.OK);
	        }

	@GetMapping("/getsubId/{subscribeID}")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public ResponseEntity<Subscribe> getSubId(@PathVariable int subscribeID)
	{
		
		return new ResponseEntity(service.getSubId(subscribeID),HttpStatus.OK);
	}
	

	

}
