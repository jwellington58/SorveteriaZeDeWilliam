package com.wjw.zeDeWilliam.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wjw.zeDeWilliam.model.Picole;
import com.wjw.zeDeWilliam.repository.Picoles;
@RequestMapping("/picoles")
@RestController
public class PicoleResource {
	@Autowired
	Picoles p;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Picole> listarPicoles(){

		return p.listarPicoles();
	}
}
