package com.sss.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="product-server-a",fallback=SchedualServiceHiHystric.class)
public interface AService {
	
	@RequestMapping(value="/a/a",method=RequestMethod.POST)
	String a( @RequestParam("name")String name) ;

}
