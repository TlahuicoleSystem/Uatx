package com.uatx.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uatx.rest.model.ColorVO;

public interface ColorRepository extends JpaRepository<ColorVO, Integer>{

}