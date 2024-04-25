package com.manish.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manish.Entity.ConsumerEntity;

public interface ConsumerRepo extends JpaRepository<ConsumerEntity, Integer> {

}
