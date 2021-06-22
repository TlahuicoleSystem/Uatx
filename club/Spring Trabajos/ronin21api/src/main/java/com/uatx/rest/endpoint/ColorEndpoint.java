package com.uatx.rest.endpoint;

import java.util.List;
import com.uatx.rest.model.ColorVO;
import com.uatx.rest.service.ColorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/color")
public class ColorEndpoint {
	@Autowired
	private ColorService service;
	
	@GetMapping("/get")
	public List<ColorVO> getColors(){
		List<ColorVO> colors = service.getColors();
		return colors;
	}
	
	@PostMapping("/insert")
	public Integer insertColor(@RequestBody ColorVO color){
		Integer newId = service.insert(color);
		return newId;
	}
}
