package com.manish.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manish.Entity.ConsumerEntity;
import com.manish.Service.ConsumerSerivce;
import com.manish.dto.ConsumerDto;

@RestController
public class ConsumerRestController {

	@Autowired
	private ConsumerSerivce serivce;
	
	@PostMapping("/add")
	public ResponseEntity<String> addConsumer(@RequestBody ConsumerDto dto) {
		String consumer = serivce.saveConsumer(dto);
		return new ResponseEntity<String>(consumer, HttpStatus.OK);
		
	}
	   @GetMapping("/data/{id}")
	    public ConsumerDto getDataById(@PathVariable Integer id) {
	            ConsumerDto byId = serivce.findDataById(id);
                    return byId;	            
}
	   @GetMapping("/all")
	      public ResponseEntity<List<ConsumerEntity>> getData(){
	    	    List<ConsumerEntity> allData = serivce.getAllData();
			return new ResponseEntity<>(allData, HttpStatus.OK);
	    	    
	      }
	   
}