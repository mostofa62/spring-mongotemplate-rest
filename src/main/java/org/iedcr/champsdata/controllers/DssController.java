package org.iedcr.champsdata.controllers;

import org.iedcr.champsdata.repositories.DssRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DssController {
	
	@Autowired
	private DssRepository dssRepository;
	
	final Pageable pageableRequest = PageRequest.of(0, 2);
	
	@GetMapping("/")
	public String index() {
		
		
		return "";
	}
	
	@GetMapping({"/data","/data/{pageNumber}"})
	public Page data(@PathVariable(required = false) Long pageNumber) {
		Page page = dssRepository.getByPage(pageNumber);
		
		return page;
	}

}
