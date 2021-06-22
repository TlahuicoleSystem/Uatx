package com.uatx.rest.service;

import java.util.List;
import com.uatx.rest.model.ColorVO;
import com.uatx.rest.repository.ColorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ColorService {
	@Autowired
	ColorRepository repository;
	
	public List<ColorVO> getColors() {
		List<ColorVO> colors = repository.findAll();
		return colors;
	}
	
	public Integer insert(ColorVO color) {
		ColorVO newColor = repository.save(color);
		return newColor.getId();
	}
}


