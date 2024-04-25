package com.manish.Service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manish.Entity.ConsumerEntity;
import com.manish.Repo.ConsumerRepo;
import com.manish.dto.ConsumerDto;

@Service
public class ConsumerServiceImpl implements ConsumerSerivce{
	
	@Autowired
	private ConsumerRepo repo;
	
@Override
public String saveConsumer(ConsumerDto dto) {
	   ModelMapper mapper = new ModelMapper();
	   ConsumerEntity consumerEntity = mapper.map(dto, ConsumerEntity.class);
	/*
	 * ConsumerEntity ce = new ConsumerEntity();
	 *  //ce.setId(dto.getId());
	 * ce.setName(dto.getName()); 
	 * ce.setCity(dto.getCity());
	 * ce.setGender(dto.getGender()); 
	 * ce.setAmount(dto.getAmount());
	 */
	
	   repo.save(consumerEntity);
	return  "consumer data is saved...";
}
    
  @Override
public ConsumerDto findDataById(Integer id) {
	  
	ConsumerEntity consumerEntity = repo.findById(id).get();
	  ModelMapper mapper = new ModelMapper();
	  ConsumerDto dto = mapper.map(consumerEntity, ConsumerDto.class);
	   
	
	/*
	 * ConsumerDto dto = new ConsumerDto(); 
	 * dto.setId(byId.getId());
	 * dto.setCity(byId.getCity());
	 *  dto.setGender(byId.getGender());
	 * dto.setAmount(byId.getAmount());
	 *  dto.setName(byId.getName());
	 */
	return dto;
}
      
    @Override
    public List<ConsumerEntity> getAllData() {
              List<ConsumerEntity> all = repo.findAll();
              
    	return all;
    }

}
