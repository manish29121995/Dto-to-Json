package com.manish.Service;

import java.util.List;

import com.manish.Entity.ConsumerEntity;
import com.manish.dto.ConsumerDto;

public interface ConsumerSerivce {
public String saveConsumer(ConsumerDto dto);
public ConsumerDto findDataById(Integer id);
public List<ConsumerEntity> getAllData(); 
}
